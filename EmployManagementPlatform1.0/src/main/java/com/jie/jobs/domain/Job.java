package com.jie.jobs.domain;

/**
 * Created by jiefeng on 2017/5/18.
 */
public class Job
{
    private Integer jobid = null;
    private Integer comid = null;
    private String jobname = null;
    private String jobinfo = null;
    private Integer jobnum = null;
    private String jobbegintime = null;
    private String jobendtime = null;
    private String jobmoney = null;
    private String jobstatus = null;
    private String jobtime = null;
    private Company company = null;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }
    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getJobinfo() {
        return jobinfo;
    }

    public void setJobinfo(String jobinfo) {
        this.jobinfo = jobinfo;
    }

    public Integer getComid() {
        return comid;
    }

    public void setComid(Integer comid) {
        this.comid = comid;
    }

    public Integer getJobnum() {
        return jobnum;
    }

    public void setJobnum(Integer jobnum) {
        this.jobnum = jobnum;
    }

    public String getJobbegintime() {
        return jobbegintime;
    }

    public void setJobbegintime(String jobbegintime) {
        this.jobbegintime = jobbegintime;
    }

    public String getJobendtime() {
        return jobendtime;
    }

    public void setJobendtime(String jobendtime) {
        this.jobendtime = jobendtime;
    }

    public String getJobmoney() {
        return jobmoney;
    }

    public void setJobmoney(String jobmoney) {
        this.jobmoney = jobmoney;
    }

    public String getJobstatus() {
        return jobstatus;
    }

    public void setJobstatus(String jobstatus) {
        this.jobstatus = jobstatus;
    }

    public String getJobtime() {
        return jobtime;
    }

    public void setJobtime(String jobtime) {
        this.jobtime = jobtime;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobid=" + jobid +
                ", comid=" + comid +
                ", jobname='" + jobname + '\'' +
                ", jobinfo='" + jobinfo + '\'' +
                ", jobnum=" + jobnum +
                ", jobbegintime='" + jobbegintime + '\'' +
                ", jobendtime='" + jobendtime + '\'' +
                ", jobmoney='" + jobmoney + '\'' +
                ", jobstatus='" + jobstatus + '\'' +
                ", jobtime='" + jobtime + '\'' +
                ", company=" + company +
                '}';
    }
}
