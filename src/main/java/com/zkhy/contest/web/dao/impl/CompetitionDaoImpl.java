package com.zkhy.contest.web.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zkhy.contest.web.dao.interfaces.CompetitionDao;
import com.zkhy.contest.web.dao.mapper.CompetitionMapper;
import com.zkhy.contest.web.dao.model.Competition;
import com.zkhy.contest.web.dao.model.CompetitionExample;
import com.zkhy.contest.web.dao.model.CompetitionExample.Criteria;
import com.zkhy.contest.web.util.PageConstants;

@Repository
public class CompetitionDaoImpl implements CompetitionDao {

	@Autowired
	private CompetitionMapper competitionMapper;
	
	public long maxRecordId() {
		Long maxId = this.competitionMapper.maxCompetitionId();
		if(maxId == null) {
			return PageConstants.INVALID_ID;
		}
		return maxId;
	}

	public long extractNewRecordId() {
		return maxRecordId() + 1;
	}
	
	public List<Competition> query(Competition entity, int pageIndex, int pageSize) {
		CompetitionExample example = generateExample(entity);
		example.setStartIndex(pageIndex);
		example.setRecordNum(pageSize);
		
		return competitionMapper.selectByExampleWithBLOBs(example);
	}

	public long insert(Competition record) {
		long id = extractNewRecordId();
		if (id > PageConstants.INVALID_ID) {
			record.setId(id);
			competitionMapper.insertSelective(record);
		};
		
		return id;
	}

	public Competition query(long id) {
		return competitionMapper.selectByPrimaryKey(id);
	}
	
	public int count(Competition entity) {
		CompetitionExample example = generateExample(entity);
		
		return competitionMapper.countByExample(example);
	}
	
	/**
	 * 生成查询条件
	 * @param entity
	 * @return
	 */
	private CompetitionExample generateExample(Competition entity) {
		CompetitionExample example = new CompetitionExample();
		Criteria criteria = example.createCriteria();
		
		if(entity.getOrgId() != null){
			criteria.andOrgIdEqualTo(entity.getOrgId());
		}
		if(entity.getStatus() != null){
			criteria.andStatusEqualTo(entity.getStatus());
		}
		if(entity.getName() != null){
			criteria.andNameLike(entity.getName());
		}
		
		return example;
	}
}
