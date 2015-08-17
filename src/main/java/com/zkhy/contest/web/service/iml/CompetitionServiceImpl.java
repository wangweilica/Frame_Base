/**
 * 
 */
package com.zkhy.contest.web.service.iml;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zkhy.contest.web.controller.vo.CompetitionVo;
import com.zkhy.contest.web.dao.interfaces.CompetitionDao;
import com.zkhy.contest.web.dao.model.Competition;
import com.zkhy.contest.web.service.interfaces.CompetitionSerivce;
import com.zkhy.contest.web.util.RecordStatus;

/**
 * 概要：
 * @author wangwei
 * @version:1.0.0  2014年10月30日
 */
@Service("competitionSerivce")
public class CompetitionServiceImpl implements CompetitionSerivce{
	
	@Autowired
	private CompetitionDao competitionDao;
	
	public List<CompetitionVo> getCompetitions(long orgId, int pageIndex, int pageSize) {
		Competition entity = new Competition();
		entity.setOrgId(orgId);
		
		return modelListToVoList(competitionDao.query(entity, pageIndex, pageSize));
	}
	
	public int getCompetitionsTotal(long orgId) {
		Competition entity = new Competition();
		entity.setOrgId(orgId);
		return competitionDao.count(entity);
	}
	
	public Long addCompetition(CompetitionVo vo) {
		vo.setCreateTime(new Date());
		vo.setApplyEndTime(new Date());
		vo.setCompetitionTime(new Date());
		vo.setStatus((byte)RecordStatus.VALID.ordinal());
		
		return competitionDao.insert(voToModel(vo));
	}
	
	/**
	 * 竞赛model列表转vo列表
	 * @param list
	 * @return
	 */
	private List<CompetitionVo> modelListToVoList(List<Competition> list) {
		List<CompetitionVo> result = new ArrayList<CompetitionVo>();
		for (Competition entity : list) {
			CompetitionVo vo = new CompetitionVo();
			BeanUtils.copyProperties(entity, vo);
			result.add(vo);
		}

		return result;
	}
	
	/**
	 * 竞赛vo转model
	 * @param vo
	 * @return
	 */
	private Competition voToModel(CompetitionVo vo) {
		Competition entity = new Competition();
		BeanUtils.copyProperties(vo, entity);

		return entity;
	}
}
