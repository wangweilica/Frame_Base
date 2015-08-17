package com.zkhy.contest.web.service.interfaces;

import java.util.List;

import com.zkhy.contest.web.controller.vo.CompetitionVo;

/**
  * 概要：竞赛Service
  * @author wangwei
  * @version:1.0.0  2014年10月30日
  */
public interface CompetitionSerivce {
	
	/**
	 * 根据组织ID获取竞赛列表
	 * @param orgId
	 * @return
	 */
	List<CompetitionVo> getCompetitions(long orgId, int pageIndex, int pageSize);
	
	/**
	 * 根据组织ID获取竞赛列表总数
	 * @param orgId
	 * @return
	 */
	int getCompetitionsTotal(long orgId);
	
	/**
	 * 添加竞赛
	 * @return
	 */
	Long addCompetition(CompetitionVo vo);
	
}
