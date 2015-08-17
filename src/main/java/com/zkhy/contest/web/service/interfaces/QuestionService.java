/**
 * 竞赛
 */
package com.zkhy.contest.web.service.interfaces;

import com.zkhy.contest.web.controller.vo.QuestionVo;

/**
  * 概要：QuestionService 接口 
  * @author wangwei
  * @version:1.0.0  2014年11月3日
  */
public interface QuestionService {
	
	/**
	 * 插入试题
	 * @param programQuestionVo
	 * @return
	 */
	String insertQuestion(QuestionVo vo);
	
	/**
	 * 更新试题
	 * @param vo
	 * @return
	 */
	String updateQuestion(QuestionVo vo,String type);
	
	/**
	 * 删除试题
	 * @param vo
	 * @return
	 */
	String deleteQuestion(String id, String type);
}
