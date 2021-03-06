package com.talebase.cloud.base.ms.notify.dto;

import com.talebase.cloud.base.ms.examer.dto.DReSetPassword;

/**
 * Created by bin.yang on 2016-12-6.
 */
public class DSendNotifyRequest extends DReSetPassword {

    /**
     * 发送主题
     */
    String sendSubject;

    /**
     * 邮件内容
     */
    String emailContent;

    /**
     * 短信内容
     */
    String smsContent;

    /**
     * 发送类型,0:邮件(email);1:短信(sms);2:微信(wechat)
     */
    Integer sendType;

    /**
     * 角色
     */
    Integer roleId;

    /**
     * 项目名称
     */
    String projectName;


    /**
     * 任务名称
     */
    String taskName;

    /**
     * 发送人
     */
    String sender;

    /**
     * 发送时间
     */
    String sendDate;

    /**
     * 是否勾选另存为短信
     */
    boolean whetherSaveSms;

    /**
     * 是否勾选另存为邮件
     */
    boolean whetherSaveMail;

    /**
     * 签名
     */
    String sign;

    /**
     * 新邮件模板名称
     */
    String newMailName;

    /**
     * 新短信模板名称
     */
    String newSmsName;

    /**
     * 是否默认邮件
     */
    boolean whetherDefaultMail;

    /**
     * 是否默认短信
     */
    boolean whetherDefaultSms;

    public String getSendSubject() {
        return sendSubject;
    }

    public void setSendSubject(String sendSubject) {
        this.sendSubject = sendSubject;
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public String getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent;
    }

    public Integer getSendType() {
        return sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public boolean isWhetherSaveSms() {
        return whetherSaveSms;
    }

    public void setWhetherSaveSms(boolean whetherSaveSms) {
        this.whetherSaveSms = whetherSaveSms;
    }

    public boolean isWhetherSaveMail() {
        return whetherSaveMail;
    }

    public void setWhetherSaveMail(boolean whetherSaveMail) {
        this.whetherSaveMail = whetherSaveMail;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getNewMailName() {
        return newMailName;
    }

    public void setNewMailName(String newMailName) {
        this.newMailName = newMailName;
    }

    public String getNewSmsName() {
        return newSmsName;
    }

    public void setNewSmsName(String newSmsName) {
        this.newSmsName = newSmsName;
    }

    public boolean isWhetherDefaultMail() {
        return whetherDefaultMail;
    }

    public void setWhetherDefaultMail(boolean whetherDefaultMail) {
        this.whetherDefaultMail = whetherDefaultMail;
    }

    public boolean isWhetherDefaultSms() {
        return whetherDefaultSms;
    }

    public void setWhetherDefaultSms(boolean whetherDefaultSms) {
        this.whetherDefaultSms = whetherDefaultSms;
    }
}
