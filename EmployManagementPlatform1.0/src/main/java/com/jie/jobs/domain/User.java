package com.jie.jobs.domain;

/**
 * Created by jiefeng on 2017/5/17.
 */
public class User
{
    private Integer userid = null;
    private String userloginname = null;
    private String userpass = null;
    private String username = null;
    private String userstatus = "1";
    private Integer usersid = null;
    private String usertype = null;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserloginname() {
        return userloginname;
    }

    public void setUserloginname(String userloginname) {
        this.userloginname = userloginname;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(String userstatus) {
        this.userstatus = userstatus;
    }

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", userloginname='" + userloginname + '\'' +
                ", userpass='" + userpass + '\'' +
                ", username='" + username + '\'' +
                ", userstatus='" + userstatus + '\'' +
                ", usersid='" + usersid + '\'' +
                ", usertype='" + usertype + '\'' +
                '}';
    }
}
