/**
 * 竞赛
 */
package com.zkhy.contest.web.controller.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.zkhy.contest.web.dao.mongo.question.MultipleChoiceQuestion;
import com.zkhy.contest.web.dao.mongo.question.Question;
import com.zkhy.contest.web.util.DateUtil;
import com.zkhy.contest.web.util.StringUtil;

/**
  * 概要：多选题 
  * @author wangwei
  * @version:1.0.0  2014年11月3日
  */
public class MultipleChoiceQuestionVo extends QuestionVo implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5808163593863081950L;

	/**
	 * 选项
	 */
	protected String[] options;
	
	/**
	 * 答案数组
	 */
	private int[] answerIndices;

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
	 * @return the answerIndices
	 */
	public int[] getAnswerIndices() {
		return answerIndices;
	}

	/**
	 * @param answerIndices the answerIndices to set
	 */
	public void setAnswerIndices(int[] answerIndices) {
		this.answerIndices = answerIndices;
	}

	/**
	 * 多选题Model转化为Vo
	 */
	@Override
	public QuestionVo QuestionModelToVo(Question question) {
		try {
			QuestionVo vo = new MultipleChoiceQuestionVo();

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
	 * 多选题Vo转化为Model
	 */
	@Override
	public Question QuestionVoToModel(QuestionVo vo) {
		try {
			Question question = new MultipleChoiceQuestion();
			BeanUtils.copyProperties(vo, question, IGNORE_PROPERTIES);
			return question;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 多选题Model列表转化为Vo
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
