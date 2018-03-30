package mw.base.mybatis.dao.mapper;

import java.util.List;
import mw.base.mybatis.dao.model.TUser;
import mw.base.mybatis.dao.model.TUserExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    int countByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    int deleteByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    @Delete({
        "delete from t_user",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    @Insert({
        "insert into t_user (user_id, user_name, ",
        "credits, password, ",
        "last_visit, last_ip)",
        "values (#{userId,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{credits,jdbcType=INTEGER}, #{password,jdbcType=VARCHAR}, ",
        "#{lastVisit,jdbcType=TIMESTAMP}, #{lastIp,jdbcType=VARCHAR})"
    })
    int insert(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    int insertSelective(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    List<TUser> selectByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    @Select({
        "select",
        "user_id, user_name, credits, password, last_visit, last_ip",
        "from t_user",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    TUser selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    int updateByPrimaryKeySelective(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    @Update({
        "update t_user",
        "set user_name = #{userName,jdbcType=VARCHAR},",
          "credits = #{credits,jdbcType=INTEGER},",
          "password = #{password,jdbcType=VARCHAR},",
          "last_visit = #{lastVisit,jdbcType=TIMESTAMP},",
          "last_ip = #{lastIp,jdbcType=VARCHAR}",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TUser record);
}