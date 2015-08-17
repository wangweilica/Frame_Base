/**
 * 竞赛
 */
package com.zkhy.contest.web.controller.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.zkhy.contest.web.dao.mongo.question.ProgramQuestion;
import com.zkhy.contest.web.dao.mongo.question.Question;
import com.zkhy.contest.web.util.DateUtil;
import com.zkhy.contest.web.util.StringUtil;

/**
  * 概要：编程题
  * @author wangwei
  * @version:1.0.0  2014年11月3日
  */
public class ProgramQuestionVo extends QuestionVo implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1600761837665755263L;

	/**
	 * 测试输入
	 */
	private String[] testInput;
	
	/**
	 * 测试输出
	 */
	private String[] expectedOutput;
	
	/**
	 * 代码头部
	 */
	private String codeHead;
	
	/**
	 * 代码尾部
	 */
	private String codeTail;
	
	/**
	 * 时间限制，精确到毫秒
	 */
	private int limitTimeMill;
	
	/**
	 * 内存限制，精确到KB
	 */
	private int limitMemoryKB;

	/**
	 * @return the testInput
	 */
	public String[] getTestInput() {
		return testInput;
	}

	/**
	 * @param testInput the testInput to set
	 */
	public void setTestInput(String[] testInput) {
		this.testInput = testInput;
	}

	/**
	 * @return the expectedOutput
	 */
	public String[] getExpectedOutput() {
		return expectedOutput;
	}

	/**
	 * @param expectedOutput the expectedOutput to set
	 */
	public void setExpectedOutput(String[] expectedOutput) {
		this.expectedOutput = expectedOutput;
	}

	/**
	 * @return the codeHead
	 */
	public String getCodeHead() {
		return codeHead;
	}

	/**
	 * @param codeHead the codeHead to set
	 */
	public void setCodeHead(String codeHead) {
		this.codeHead = codeHead;
	}

	/**
	 * @return the codeTail
	 */
	public String getCodeTail() {
		return codeTail;
	}

	/**
	 * @param codeTail the codeTail to set
	 */
	public void setCodeTail(String codeTail) {
		this.codeTail = codeTail;
	}

	/**
	 * @return the limitTimeMill
	 */
	public int getLimitTimeMill() {
		return limitTimeMill;
	}

	/**
	 * @param limitTimeMill the limitTimeMill to set
	 */
	public void setLimitTimeMill(int limitTimeMill) {
		this.limitTimeMill = limitTimeMill;
	}

	/**
	 * @return the limitMemoryKB
	 */
	public int getLimitMemoryKB() {
		return limitMemoryKB;
	}

	/**
	 * @param limitMemoryKB the limitMemoryKB to set
	 */
	public void setLimitMemoryKB(int limitMemoryKB) {
		this.limitMemoryKB = limitMemoryKB;
	}

	/**
	 * 编程题Model转化为Vo
	 */
	@Override
	public QuestionVo QuestionModelToVo(Question question) {
		try {
			QuestionVo vo = new ProgramQuestionVo();

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
	 * 编程题Vo转化为Model
	 */
	@Override
	public Question QuestionVoToModel(QuestionVo vo) {
		try {
			Question question = new ProgramQuestion();
			BeanUtils.copyProperties(vo, question, IGNORE_PROPERTIES);
			return question;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 编程题Model列表转化为Vo
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
