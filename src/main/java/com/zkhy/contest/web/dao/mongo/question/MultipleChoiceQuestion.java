/**
 * 题库
 */
package com.zkhy.contest.web.dao.mongo.question;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.util.StringUtils;

/**
 * 概要：多选题
 * @author yachen
 * @version 1.0.0 2014-2-16
 */
public class MultipleChoiceQuestion extends ChoiceQuestion {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -560038777264717270L;

	/**
	 * 集合名称
	 */
	public static final String COLLECTION_NAME = "multiple_choice";
	
	/**
	 * 答案数组
	 */
	private int[] answerIndices;

	
	/* (non-Javadoc)
	 * @see com.zkhy.qb.web.dao.mongo.question.Question#isCorrect()
	 */
	@Override
	public boolean isCorrect() {
		
		//排序之后末尾元素为最大值，应当小于选项的数量
		if(!hasValidOptions() 
				|| answerIndices == null 
				|| answerIndices[answerIndices.length-1] > options.length-1 
				|| answerIndices[0] < 0
				|| !StringUtils.hasText(description)) {
			return false;
		}
		
		return true;
	}

	/**
	 * @return the answerIndices
	 */
	public int[] getAnswerIndices() {
		return answerIndices;
	}
	
	/**
	 * @param answerIndices the answerIndices to set
	 */
	public void setAnswerIndices(int[] answerIndices) {
		//去除重复的元素
		HashSet<Integer> answerSet = new HashSet<Integer>();
		
		for(int index : answerIndices) {
			answerSet.add(index);
		}
		
		//结果按升序排列
		this.answerIndices = new int[answerSet.size()];
		int i=0;
		for(Integer index : answerSet) {
			this.answerIndices[i] = index;
			i++;
		}
		Arrays.sort(this.answerIndices);
	}

	/* (non-Javadoc)
	 * @see com.zkhy.qb.web.dao.mongo.QuestionBankRecord#collectionName()
	 */
	@Override
	public String collectionName() {
		return COLLECTION_NAME;
	}
	
}
