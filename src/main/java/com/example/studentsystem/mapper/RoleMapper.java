package com.example.studentsystem.mapper;

import com.example.studentsystem.entity.Role;
import com.example.studentsystem.entity.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Wed Apr 20 11:34:33 BST 2022
     */
    int countByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Wed Apr 20 11:34:33 BST 2022
     */
    int deleteByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Wed Apr 20 11:34:33 BST 2022
     */
    int deleteByPrimaryKey(Integer roleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Wed Apr 20 11:34:33 BST 2022
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Wed Apr 20 11:34:33 BST 2022
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Wed Apr 20 11:34:33 BST 2022
     */
    List<Role> selectByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Wed Apr 20 11:34:33 BST 2022
     */
    Role selectByPrimaryKey(Integer roleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Wed Apr 20 11:34:33 BST 2022
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Wed Apr 20 11:34:33 BST 2022
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Wed Apr 20 11:34:33 BST 2022
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Wed Apr 20 11:34:33 BST 2022
     */
    int updateByPrimaryKey(Role record);
}