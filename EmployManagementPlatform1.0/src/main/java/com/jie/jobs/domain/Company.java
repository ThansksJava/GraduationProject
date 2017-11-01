package com.jie.jobs.domain;

/**
 * Created by jiefeng on 2017/5/18.
 */
public class Company
{
    private Integer comid = null;
    private String comno = null;
    private String comname = null;
    private String comaddr = null;
    private String comaddrcode = null;
    private String comcontacks = null;
    private String comcontackstel = null;
    private String comsize = null;
    private String comtype = null;
    private String comstatus = null;
    private String cominfo = null;
    private String comcheck = null;
    private String comchecktime = null;

    public Integer getComid() {
        return comid;
    }

    public void setComid(Integer comid) {
        this.comid = comid;
    }

    public String getComno() {
        return comno;
    }

    public void setComno(String comno) {
        this.comno = comno;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public String getComaddr() {
        return comaddr;
    }

    public void setComaddr(String comaddr) {
        this.comaddr = comaddr;
    }

    public String getComaddrcode() {
        return comaddrcode;
    }

    public void setComaddrcode(String comaddrcode) {
        this.comaddrcode = comaddrcode;
    }

    public String getComcontacks() {
        return comcontacks;
    }

    public void setComcontacks(String comcontacks) {
        this.comcontacks = comcontacks;
    }

    public String getComcontackstel() {
        return comcontackstel;
    }

    public void setComcontackstel(String comcontackstel) {
        this.comcontackstel = comcontackstel;
    }

    public String getComsize() {
        return comsize;
    }

    public void setComsize(String comsize) {
        this.comsize = comsize;
    }

    public String getComtype() {
        return comtype;
    }

    public void setComtype(String comtype) {
        this.comtype = comtype;
    }

    public String getComstatus() {
        return comstatus;
    }

    public void setComstatus(String comstatus) {
        this.comstatus = comstatus;
    }

    public String getCominfo() {
        return cominfo;
    }

    public void setCominfo(String cominfo) {
        this.cominfo = cominfo;
    }

    public String getComcheck() {
        return comcheck;
    }

    public void setComcheck(String comcheck) {
        this.comcheck = comcheck;
    }

    public String getComchecktime() {
        return comchecktime;
    }

    public void setComchecktime(String comchecktime) {
        this.comchecktime = comchecktime;
    }

    @Override
    public String toString() {
        return "Company{" +
                "comid=" + comid +
                ", comno='" + comno + '\'' +
                ", comname='" + comname + '\'' +
                ", comaddr='" + comaddr + '\'' +
                ", comaddrcode='" + comaddrcode + '\'' +
                ", comcontacks='" + comcontacks + '\'' +
                ", comcontackstel='" + comcontackstel + '\'' +
                ", comsize='" + comsize + '\'' +
                ", comtype='" + comtype + '\'' +
                ", comstatus='" + comstatus + '\'' +
                ", cominfo='" + cominfo + '\'' +
                ", comcheck='" + comcheck + '\'' +
                ", comchecktime='" + comchecktime + '\'' +
                '}';
    }
}
