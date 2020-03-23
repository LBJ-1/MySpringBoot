package com.lbj.vip.model;

import java.util.Date;

/**
 * @Author Liu.B.J
 * VIP详细信息
 */
public class VipInfo {
    private Integer id;
    private String vipType;// 会员类型
    private String phone;// 会员手机
    private String vipLevel;// 会员等级
    private String userName;// 会员名
    private String cardNo;// 会员卡号
    private String email;// 会员邮箱
    private String address;// 会员地址
    private String birthday;// 会员生日
    private Integer sex;// 性别
    private String vipStatus;// vip状态
    private Integer isPermanent;// 是否永久有效 0是
    private String expiryDate;// 过期日期
    private double surplusAmount;// 剩余金额
    private double originalAmount;// 原始充值金额
    private Integer createrID;// 创建者ID
    private String remark;// 备注

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getSex() {
        return sex;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getVipStatus() {
        return vipStatus;
    }

    public void setVipStatus(String vipStatus) {
        this.vipStatus = vipStatus;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getIsPermanent() {
        return isPermanent;
    }

    public void setIsPermanent(Integer isPermanent) {
        this.isPermanent = isPermanent;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getSurplusAmount() {
        return surplusAmount;
    }

    public void setSurplusAmount(double surplusAmount) {
        this.surplusAmount = surplusAmount;
    }

    public double getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(double originalAmount) {
        this.originalAmount = originalAmount;
    }

    public Integer getCreaterID() {
        return createrID;
    }

    public void setCreaterID(Integer createrID) {
        this.createrID = createrID;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
