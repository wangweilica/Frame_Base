/**
 * 竞赛
 */
package com.zkhy.contest.web.controller.vo;

import java.io.Serializable;
import java.util.List;

import com.zkhy.contest.web.dao.mongo.question.Question;
import com.zkhy.contest.web.util.RecordStatus;

/**
  * 概要：
  * @author wangwei
  * @version:1.0.0  2014年11月3日
  */
public abstract class QuestionVo extends Object implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6942167089186444675L;

	/**
	 * ID
	 */
	protected String id;
	
	/**
	 * 题目分值
	 */
	private int score;
	
	/**
	 * 创建时间
	 */
	protected String createTime;
	
	/**
	 * 最后一次更新时间
	 */
	protected String lastUpdateTime;
	
	/**
	 * 记录状态
	 */
	protected RecordStatus status;
	
	/**
	 * 题目描述
	 */
	protected String description;
	
	/**
	 * vo转model时不需要copy的属性
	 */
	protected String[] IGNORE_PROPERTIES = new String[]{"id", "createTime", "lastUpdateTime", "status"};
	
	/**
	 * model转vo时不需要copy的属性
	 */
	protected String[] IGNORE_PROPERTIE = new String[]{ "createTime", "lastUpdateTime", "status"};
	
	/**
	 * Model转VO
	 * @param question
	 * @return
	 */
	public abstract QuestionVo QuestionModelToVo(Question question);
	
	/**
	 * VO转Model
	 * @param vo
	 * @return
	 */
	public abstract Question QuestionVoToModel(QuestionVo vo);

	/**
	 * Vo列表转model列表
	 * @param qList
	 * @return
	 */
	public abstract List<QuestionVo> ModelListToVoList(List<Question> qList);
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
	 * @return the createTime
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the lastUpdateTime
	 */
	public String getLastUpdateTime() {
		return lastUpdateTime;
	}

	/**
	 * @param lastUpdateTime the lastUpdateTime to set
	 */
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	/**
	 * @return the status
	 */
	public RecordStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(RecordStatus status) {
		this.status = status;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
}
