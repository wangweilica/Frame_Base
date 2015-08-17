package com.zkhy.contest.web.dao.mapper;

import com.zkhy.contest.web.dao.model.Apply;
import com.zkhy.contest.web.dao.model.ApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbggenerated Tue Nov 04 14:08:53 CST 2014
     */
    int countByExample(ApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbggenerated Tue Nov 04 14:08:53 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbggenerated Tue Nov 04 14:08:53 CST 2014
     */
    int insert(Apply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbggenerated Tue Nov 04 14:08:53 CST 2014
     */
    int insertSelective(Apply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbggenerated Tue Nov 04 14:08:53 CST 2014
     */
    List<Apply> selectByExample(ApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbggenerated Tue Nov 04 14:08:53 CST 2014
     */
    Apply selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbggenerated Tue Nov 04 14:08:53 CST 2014
     */
    int updateByExampleSelective(@Param("record") Apply record, @Param("example") ApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbggenerated Tue Nov 04 14:08:53 CST 2014
     */
    int updateByExample(@Param("record") Apply record, @Param("example") ApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbggenerated Tue Nov 04 14:08:53 CST 2014
     */
    int updateByPrimaryKeySelective(Apply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbggenerated Tue Nov 04 14:08:53 CST 2014
     */
    int updateByPrimaryKey(Apply record);
}