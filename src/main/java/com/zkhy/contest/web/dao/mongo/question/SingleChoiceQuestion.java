/**
 * 题库
 */
package com.zkhy.contest.web.dao.mongo.question;

import org.springframework.util.StringUtils;

/**
 * 概要：单选题
 * @author yachen
 * @version 1.0.0 2014-2-16
 */
public class SingleChoiceQuestion extends ChoiceQuestion {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -474530335331586831L;

	/**
	 * 集合名称
	 */
	public static final String COLLECTION_NAME = "single_choice";
	
	/**
	 * 答案序号：从0开始
	 */
	private int answerIndex;

	/* (non-Javadoc)
	 * @see com.zkhy.qb.web.dao.mongo.question.Question#isCorrect()
	 */
	@Override
	public boolean isCorrect() {
		//选项有效，且选项范围不超过选项的数量且选项大于等于0
		if(!hasValidOptions() 
				|| answerIndex>options.length-1 
				|| answerIndex<0
				|| !StringUtils.hasText(description)) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * @return the answerIndex
	 */
	public int getAnswerIndex() {
		return answerIndex;
	}

	/**
	 * @param answerIndex the answerIndex to set
	 */
	public void setAnswerIndex(int answerIndex) {
		this.answerIndex = answerIndex;
	}

	/* (non-Javadoc)
	 * @see com.zkhy.qb.web.dao.mongo.QuestionBankRecord#collectionName()
	 */
	@Override
	public String collectionName() {
		return COLLECTION_NAME;
	}


}
