package com.zkhy.contest.web.dao.model;

import java.util.Date;

public class PaperTemplate {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_template.template_id
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    private Long templateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_template.company_id
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    private Long companyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_template.template_name
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    private String templateName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_template.single
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    private Integer single;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_template.multiple
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    private Integer multiple;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_template.program
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    private Integer program;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_template.test_time
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    private Integer testTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_template.update_time
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_template.status
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    private Byte status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_template.template_id
     *
     * @return the value of paper_template.template_id
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_template.template_id
     *
     * @param templateId the value for paper_template.template_id
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_template.company_id
     *
     * @return the value of paper_template.company_id
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_template.company_id
     *
     * @param companyId the value for paper_template.company_id
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_template.template_name
     *
     * @return the value of paper_template.template_name
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_template.template_name
     *
     * @param templateName the value for paper_template.template_name
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_template.single
     *
     * @return the value of paper_template.single
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public Integer getSingle() {
        return single;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_template.single
     *
     * @param single the value for paper_template.single
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public void setSingle(Integer single) {
        this.single = single;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_template.multiple
     *
     * @return the value of paper_template.multiple
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public Integer getMultiple() {
        return multiple;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_template.multiple
     *
     * @param multiple the value for paper_template.multiple
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public void setMultiple(Integer multiple) {
        this.multiple = multiple;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_template.program
     *
     * @return the value of paper_template.program
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public Integer getProgram() {
        return program;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_template.program
     *
     * @param program the value for paper_template.program
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public void setProgram(Integer program) {
        this.program = program;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_template.test_time
     *
     * @return the value of paper_template.test_time
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public Integer getTestTime() {
        return testTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_template.test_time
     *
     * @param testTime the value for paper_template.test_time
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public void setTestTime(Integer testTime) {
        this.testTime = testTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_template.update_time
     *
     * @return the value of paper_template.update_time
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_template.update_time
     *
     * @param updateTime the value for paper_template.update_time
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_template.status
     *
     * @return the value of paper_template.status
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_template.status
     *
     * @param status the value for paper_template.status
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}