/**
 * 题库
 */
package com.zkhy.contest.web.dao.mongo.question;

import org.springframework.util.StringUtils;

/**
 * 概要： 编程题
 * @author yachen
 * @version 1.0.0 2014-2-16
 */
public class ProgramQuestion extends Question {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -193185450526918121L;

	/**
	 * 集合名称
	 */
	public static final String COLLECTION_NAME = "program";
	
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
	

	/* (non-Javadoc)
	 * @see com.zkhy.qb.web.dao.mongo.question.Question#isCorrect()
	 */
	@Override
	public boolean isCorrect() {
		if(expectedOutput == null || !StringUtils.hasText(description)) {
			return false;
		}
		
		if(testInput==null || testInput.length==0 && expectedOutput.length!=1) {
			return false;
		}
		
		if(testInput.length != expectedOutput.length) {
			return false;
		}
		
		return true;
	}
	

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


	/* (non-Javadoc)
	 * @see com.zkhy.qb.web.dao.mongo.QuestionBankRecord#collectionName()
	 */
	@Override
	public String collectionName() {
		return COLLECTION_NAME;
	}
	
}
