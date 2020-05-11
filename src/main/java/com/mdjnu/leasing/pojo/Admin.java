package com.mdjnu.leasing.pojo;

import java.io.Serializable;
import java.util.Date;

public class Admin implements Serializable {
    private Integer adminId;

    private String adminName;

    private String adminPassword;

    private String jobNumber;

    private String jobPhone;

    private Float jobSalary;

    private Date jobEntryTime;

    private static final long serialVersionUID = 1L;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber == null ? null : jobNumber.trim();
    }

    public String getJobPhone() {
        return jobPhone;
    }

    public void setJobPhone(String jobPhone) {
        this.jobPhone = jobPhone == null ? null : jobPhone.trim();
    }

    public Float getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(Float jobSalary) {
        this.jobSalary = jobSalary;
    }

    public Date getJobEntryTime() {
        return jobEntryTime;
    }

    public void setJobEntryTime(Date jobEntryTime) {
        this.jobEntryTime = jobEntryTime;
    }
}