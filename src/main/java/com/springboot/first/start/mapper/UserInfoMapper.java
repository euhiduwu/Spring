package com.springboot.first.start.mapper;

import com.springboot.first.start.mybatis.UserInfo;
import com.springboot.first.start.mybatis.UserInfoExample;
import com.springboot.first.start.mybatis.UserInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Dec 07 15:08:01 CST 2018
     */
    int countByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Dec 07 15:08:01 CST 2018
     */
    int deleteByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Dec 07 15:08:01 CST 2018
     */
    int deleteByPrimaryKey(UserInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Dec 07 15:08:01 CST 2018
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Dec 07 15:08:01 CST 2018
     */
    int insertSelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Dec 07 15:08:01 CST 2018
     */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Dec 07 15:08:01 CST 2018
     */
    UserInfo selectByPrimaryKey(UserInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Dec 07 15:08:01 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Dec 07 15:08:01 CST 2018
     */
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Dec 07 15:08:01 CST 2018
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri Dec 07 15:08:01 CST 2018
     */
    int updateByPrimaryKey(UserInfo record);
}