package com.zkhy.contest.web.controller.vo;

import java.util.Date;

public class PaperTemplateVo {

	/**
	 * 模版ID
	 */
	private Long templateId;

	/**
	 * 公司ID
	 */
	private Long companyId;
	
	/**
	 * 模版名
	 */
	private String templateName;
	
	/**
	 * 单选题数目
	 */
	private Integer single;
	
	/**
	 * 多选题数目
	 */
	private Integer multiple;
	
	/**
	 * 编程题数目
	 */
	private Integer program;
	
	/**
	 * 考试时长
	 */
	private Integer testTime;
	
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
	/**
	 * 状态
	 */
	private Byte status;

	/**
	 * @return the templateId
	 */
	public Long getTemplateId() {
		return templateId;
	}

	/**
	 * @param templateId the templateId to set
	 */
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	/**
	 * @return the companyId
	 */
	public Long getCompanyId() {
		return companyId;
	}

	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	/**
	 * @return the templateName
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * @param templateName the templateName to set
	 */
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	/**
	 * @return the single
	 */
	public Integer getSingle() {
		return single;
	}

	/**
	 * @param single the single to set
	 */
	public void setSingle(Integer single) {
		this.single = single;
	}

	/**
	 * @return the multiple
	 */
	public Integer getMultiple() {
		return multiple;
	}

	/**
	 * @param multiple the multiple to set
	 */
	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
	}

	/**
	 * @return the program
	 */
	public Integer getProgram() {
		return program;
	}

	/**
	 * @param program the program to set
	 */
	public void setProgram(Integer program) {
		this.program = program;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @return the testTime
	 */
	public Integer getTestTime() {
		return testTime;
	}

	/**
	 * @param testTime the testTime to set
	 */
	public void setTestTime(Integer testTime) {
		this.testTime = testTime;
	}

	/**
	 * @return the status
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}
}