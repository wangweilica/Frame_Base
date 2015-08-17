/**
 * 竞赛
 */
package com.zkhy.contest.web.dao.mongo.question;

import com.zkhy.contest.web.dao.mongo.Taggable;

/**
  * 概要：题目基类
  * @author wangwei
  * @version:1.0.0  2014年11月3日
  */
public abstract class Question extends Taggable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2383549725195171913L;
	
	/**
	 * 题目描述
	 */
	protected String description;
	
	/**
	 * 题目分值
	 */
	private int score;
	
	/**
	 * 题目是否正确
	 * @return
	 */
	public abstract boolean isCorrect();

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
