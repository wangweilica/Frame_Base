/**
 * 竞赛
 */
package com.zkhy.contest.web.dao.mongo.exam;

import com.zkhy.contest.web.dao.mongo.Taggable;
import com.zkhy.contest.web.util.QuestionType;

/**
  * 概要：试卷
  * @author wangwei
  * @version:1.0.0  2014年11月3日
  */
public class Exam extends Taggable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5536809002203654521L;

	/**
	 * 集合名称
	 */
	public static final String COLLECTION_NAME = "exam";
	
	/**
	 * 默认考试时间120分钟
	 */
	public static final int DEFAULT_TIME_LIMIT = 120;
	
	/**
	 * 所属竞赛ID
	 */
	private String contestId;
	
	/**
	 * 题目Id
	 */
	private String[] questionId;
	
	/**
	 * 题目类型
	 */
	private QuestionType[] questionType;
	
	/**
	 * 题目时间限制
	 */
	private int timeLimitInMinute;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the contestId
	 */
	public String getContestId() {
		return contestId;
	}

	/**
	 * @param contestId the contestId to set
	 */
	public void setContestId(String contestId) {
		this.contestId = contestId;
	}

	/**
	 * @return the questionId
	 */
	public String[] getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(String[] questionId) {
		this.questionId = questionId;
	}

	/**
	 * @return the questionType
	 */
	public QuestionType[] getQuestionType() {
		return questionType;
	}

	/**
	 * @param questionType the questionType to set
	 */
	public void setQuestionType(QuestionType[] questionType) {
		this.questionType = questionType;
	}

	/**
	 * @return the timeLimitInMinute
	 */
	public int getTimeLimitInMinute() {
		return timeLimitInMinute;
	}

	/* (non-Javadoc)
	 * @see com.zkhy.qb.web.dao.mongo.QuestionBankRecord#collectionName()
	 */
	@Override
	public String collectionName() {
		return COLLECTION_NAME;
	}
}
