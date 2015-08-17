/**
 * 题库
 */

package com.zkhy.contest.web.controller.vo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.zkhy.contest.web.dao.mongo.question.Question;
import com.zkhy.contest.web.dao.mongo.question.SingleChoiceQuestion;
import com.zkhy.contest.web.util.DateUtil;
import com.zkhy.contest.web.util.StringUtil;

/**
  * 概要：单选题 
  * @author wangwei
  * @version:1.0.0
  * @date 2014-4-2
  */
public class SingleChoiceQuestionVo extends QuestionVo{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1986301482640278196L;

	/**
	 * 选项
	 */
	protected String[] options;
	
	/**
	 * 答案序号：从0开始
	 */
	private int answerIndex;
	
	/**
	 * 重写构造方法
	 * @param options
	 * @param answerIndex
	 */
	public SingleChoiceQuestionVo(String[] options, int answerIndex) {
		new SingleChoiceQuestionVo();
		this.options = options;
		this.answerIndex = answerIndex;
	}

	public SingleChoiceQuestionVo() {
	}
	/**
	 * @return the options
	 */
	public String[] getOptions() {
		return options;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(String[] options) {
		this.options = options;
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

	/**
	 * 单选题Model转化为Vo
	 */
	@Override
	public QuestionVo QuestionModelToVo(Question question) {
		try {
			QuestionVo vo = new SingleChoiceQuestionVo();

			if (!StringUtil.isNullOrEmpty(question.getCreateTime())) {
				vo.setCreateTime(DateUtil.dateToStr(question.getCreateTime()));
			}
			if (!StringUtil.isNullOrEmpty(question.getLastUpdateTime())) {
				vo.setLastUpdateTime(DateUtil.dateToStr(question
						.getLastUpdateTime()));
			}

			BeanUtils.copyProperties(question, vo, IGNORE_PROPERTIE);
			return vo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 单选题Vo转化为Model
	 */
	@Override
	public Question QuestionVoToModel(QuestionVo vo) {
		try {
			Question question = new SingleChoiceQuestion();
			BeanUtils.copyProperties(vo, question);
			return question;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	/**
	 * 单选题Model列表转化为Vo
	 */
	@Override
	public List<QuestionVo> ModelListToVoList(List<Question> qList) {
		try {
			List<QuestionVo> qVoList = new ArrayList<QuestionVo>();
			for (Question q : qList) {
				qVoList.add(QuestionModelToVo(q));
			}
			return qVoList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
