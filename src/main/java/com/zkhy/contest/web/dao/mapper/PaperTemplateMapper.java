package com.zkhy.contest.web.dao.mapper;

import com.zkhy.contest.web.dao.model.PaperTemplate;
import com.zkhy.contest.web.dao.model.PaperTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_template
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    int countByExample(PaperTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_template
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    int deleteByPrimaryKey(Long templateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_template
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    int insert(PaperTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_template
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    int insertSelective(PaperTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_template
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    List<PaperTemplate> selectByExample(PaperTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_template
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    PaperTemplate selectByPrimaryKey(Long templateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_template
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    int updateByExampleSelective(@Param("record") PaperTemplate record, @Param("example") PaperTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_template
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    int updateByExample(@Param("record") PaperTemplate record, @Param("example") PaperTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_template
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    int updateByPrimaryKeySelective(PaperTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_template
     *
     * @mbggenerated Thu Oct 30 10:01:55 CST 2014
     */
    int updateByPrimaryKey(PaperTemplate record);
}