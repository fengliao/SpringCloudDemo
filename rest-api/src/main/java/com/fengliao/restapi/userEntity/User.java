package com.fengliao.restapi.userEntity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
    private String userId;
    private String userNo;
    private String userName;
    private String password;
    private String userRealname;
    private String userPhone;
    private String userIdcard;
    private String userSex;
    private String userPosition;
    private String userImg;
    private String userRemark;
    private String deptId;
    private String deptName;
    private String flag;
    private String deleteFlag;
    @DateTimeFormat
    private Date createTime;
    private String createBy;
    private String ip;
    private Integer loginTimes;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    public User(String userId, String userNo, String userName, String password, String userRealname, String userPhone, String userIdcard, String userSex, String userPosition, String userImg, String userRemark, String deptId, String deptName, String flag, String deleteFlag, Date createTime, String createBy, String ip, Integer loginTimes) {
        this.userId = userId;
        this.userNo = userNo;
        this.userName = userName;
        this.password = password;
        this.userRealname = userRealname;
        this.userPhone = userPhone;
        this.userIdcard = userIdcard;
        this.userSex = userSex;
        this.userPosition = userPosition;
        this.userImg = userImg;
        this.userRemark = userRemark;
        this.deptId = deptId;
        this.deptName = deptName;
        this.flag = flag;
        this.deleteFlag = deleteFlag;
        this.createTime = createTime;
        this.createBy = createBy;
        this.ip = ip;
        this.loginTimes = loginTimes;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userNo='" + userNo + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userRealname='" + userRealname + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userIdcard='" + userIdcard + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userPosition='" + userPosition + '\'' +
                ", userImg='" + userImg + '\'' +
                ", userRemark='" + userRemark + '\'' +
                ", deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", flag='" + flag + '\'' +
                ", deleteFlag='" + deleteFlag + '\'' +
                ", createTime=" + createTime +
                ", createBy='" + createBy + '\'' +
                ", ip='" + ip + '\'' +
                ", loginTimes=" + loginTimes +
                '}';
    }
}
