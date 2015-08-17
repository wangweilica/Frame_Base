package com.zkhy.contest.web.controller.vo;

import java.util.Date;

public class CompetitionVo {

	/**
     * 竞赛ID
     */
    private Long id;

    /**
     * 组织ID
     */
    private Long orgId;

    /**
     * 竞赛名称
     */
    private String name;

    /**
     * 二维码名称
     */
    private String twoDimensionCode;

    /**
     * 竞赛时间
     */
    private Date competitionTime;

    /**
     * 报名截止日期
     */
    private Date applyEndTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 竞赛介绍
     */
    private String information;
    
    /**
     * 状态
     */
    private Byte status;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the orgId
	 */
	public Long getOrgId() {
		return orgId;
	}

	/**
	 * @param orgId the orgId to set
	 */
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the twoDimensionCode
	 */
	public String getTwoDimensionCode() {
		return twoDimensionCode;
	}

	/**
	 * @param twoDimensionCode the twoDimensionCode to set
	 */
	public void setTwoDimensionCode(String twoDimensionCode) {
		this.twoDimensionCode = twoDimensionCode;
	}

	/**
	 * @return the competitionTime
	 */
	public Date getCompetitionTime() {
		return competitionTime;
	}

	/**
	 * @param competitionTime the competitionTime to set
	 */
	public void setCompetitionTime(Date competitionTime) {
		this.competitionTime = competitionTime;
	}

	/**
	 * @return the applyEndTime
	 */
	public Date getApplyEndTime() {
		return applyEndTime;
	}

	/**
	 * @param applyEndTime the applyEndTime to set
	 */
	public void setApplyEndTime(Date applyEndTime) {
		this.applyEndTime = applyEndTime;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the information
	 */
	public String getInformation() {
		return information;
	}

	/**
	 * @param information the information to set
	 */
	public void setInformation(String information) {
		this.information = information;
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