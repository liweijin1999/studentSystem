package com.example.studentsystem.mapper;

import com.example.studentsystem.entity.UserLogin;
import com.example.studentsystem.entity.UserLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLoginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userlogin
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int countByExample(UserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userlogin
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int deleteByExample(UserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userlogin
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int deleteByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userlogin
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int insert(UserLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userlogin
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int insertSelective(UserLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userlogin
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    List<UserLogin> selectByExample(UserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userlogin
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    UserLogin selectByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userlogin
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int updateByExampleSelective(@Param("record") UserLogin record, @Param("example") UserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userlogin
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int updateByExample(@Param("record") UserLogin record, @Param("example") UserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userlogin
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int updateByPrimaryKeySelective(UserLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userlogin
     *
     * @mbggenerated Wed Apr 20 00:08:44 BST 2022
     */
    int updateByPrimaryKey(UserLogin record);
}