package com.jie.jobs.domain;
import java.io.Serializable;

/**
 * Created by jiefeng on 2017/4/18
 */
public class Student implements Serializable
{
    private Integer stuid = null;
    private String stuname = null;
    private String stuno = null;
    private String stuidcard = null;
    private String stugender = null;
    private String stunation = null;
    private String stubirth = null;
    private String stupolitical = null;
    private String stutype = null;
    private String stutel = null;
    private String stuemail = null;
    private String stunative = null;
    private String stunativecode = null;
    private String stuaddr = null;
    private String stuaddrcode = null;
    private String studep = null;
    private String stumajor = null;
    private String stustatus = "1";
    private String stucheck = null;
    private String stuchecktime = null;
    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }
    
    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }
    
    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }
    
    public String getStuidcard() {
        return stuidcard;
    }

    public void setStuidcard(String stuidcard) {
        this.stuidcard = stuidcard;
    }
    
    public String getStugender() {
        return stugender;
    }

    public void setStugender(String stugender) {
        this.stugender = stugender;
    }
    
    public String getStunation() {
        return stunation;
    }

    public void setStunation(String stunation) {
        this.stunation = stunation;
    }
    public String getStubirth() {
        return stubirth;
    }

    public void setStubirth(String stubirth) {
        this.stubirth = stubirth;
    }
    
    public String getStupolitical() {
        return stupolitical;
    }

    public void setStupolitical(String stupolitical) {
        this.stupolitical = stupolitical;
    }
    
    public String getStutype() {
        return stutype;
    }

    public void setStutype(String stutype) {
        this.stutype = stutype;
    }
    
    public String getStutel() {
        return stutel;
    }

    public void setStutel(String stutel) {
        this.stutel = stutel;
    }
    
    public String getStuemail() {
        return stuemail;
    }

    public void setStuemail(String stuemail) {
        this.stuemail = stuemail;
    }
    
    public String getStunative() {
        return stunative;
    }

    public void setStunative(String stunative) {
        this.stunative = stunative;
    }
    
    public String getStunativecode() {
        return stunativecode;
    }

    public void setStunativecode(String stunativecode) {
        this.stunativecode = stunativecode;
    }
    
    public String getStuaddr() {
        return stuaddr;
    }

    public void setStuaddr(String stuaddr) {
        this.stuaddr = stuaddr;
    }
    
    public String getStuaddrcode() {
        return stuaddrcode;
    }

    public void setStuaddrcode(String stuaddrcode) {
        this.stuaddrcode = stuaddrcode;
    }
    
    public String getStudep() {
        return studep;
    }

    public void setStudep(String studep) {
        this.studep = studep;
    }
    
    public String getStumajor() {
        return stumajor;
    }

    public void setStumajor(String stumajor) {
        this.stumajor = stumajor;
    }
    
    public String getStustatus() {
        return stustatus;
    }
    public void setStustatus(String stustatus) {
        this.stustatus = stustatus;
    }
    
    public String getStucheck() {
        return stucheck;
    }

    public void setStucheck(String stucheck) {
        this.stucheck = stucheck;
    }
    
    public String getStuchecktime() {
        return stuchecktime;
    }

    public void setStuchecktime(String stuchecktime) {
        this.stuchecktime = stuchecktime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", stuno='" + stuno + '\'' +
                ", stuidcard='" + stuidcard + '\'' +
                ", stugender='" + stugender + '\'' +
                ", stunation='" + stunation + '\'' +
                ", stubirth='" + stubirth + '\'' +
                ", stupolitical='" + stupolitical + '\'' +
                ", stutype='" + stutype + '\'' +
                ", stutel='" + stutel + '\'' +
                ", stuemail='" + stuemail + '\'' +
                ", stunative='" + stunative + '\'' +
                ", stunativecode='" + stunativecode + '\'' +
                ", stuaddr='" + stuaddr + '\'' +
                ", stuaddrcode='" + stuaddrcode + '\'' +
                ", studep='" + studep + '\'' +
                ", stumajor='" + stumajor + '\'' +
                ", stustatus='" + stustatus + '\'' +
                ", stucheck='" + stucheck + '\'' +
                ", stuchecktime='" + stuchecktime + '\'' +
                '}';
    }
}
