package mw.base.mybatis.dao.model;

import java.util.Date;

public class TLoginLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_log.login_log_id
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    private Integer loginLogId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_log.user_id
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_log.ip
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_log.login_datetime
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    private Date loginDatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_log.login_log_id
     *
     * @return the value of t_login_log.login_log_id
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    public Integer getLoginLogId() {
        return loginLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_log.login_log_id
     *
     * @param loginLogId the value for t_login_log.login_log_id
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    public void setLoginLogId(Integer loginLogId) {
        this.loginLogId = loginLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_log.user_id
     *
     * @return the value of t_login_log.user_id
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_log.user_id
     *
     * @param userId the value for t_login_log.user_id
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_log.ip
     *
     * @return the value of t_login_log.ip
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_log.ip
     *
     * @param ip the value for t_login_log.ip
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_log.login_datetime
     *
     * @return the value of t_login_log.login_datetime
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    public Date getLoginDatetime() {
        return loginDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_log.login_datetime
     *
     * @param loginDatetime the value for t_login_log.login_datetime
     *
     * @mbggenerated Fri Mar 30 13:10:04 CST 2018
     */
    public void setLoginDatetime(Date loginDatetime) {
        this.loginDatetime = loginDatetime;
    }
}