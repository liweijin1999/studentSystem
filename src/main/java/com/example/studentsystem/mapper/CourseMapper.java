package com.example.studentsystem.mapper;

import com.example.studentsystem.entity.Course;
import com.example.studentsystem.entity.CourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int countByExample(CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int deleteByExample(CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int deleteByPrimaryKey(Integer courseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int insert(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int insertSelective(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    List<Course> selectByExample(CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    Course selectByPrimaryKey(Integer courseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int updateByPrimaryKeySelective(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int updateByPrimaryKey(Course record);
}