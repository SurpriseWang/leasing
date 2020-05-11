package com.mdjnu.leasing.service;

import com.mdjnu.leasing.pojo.Admin;

import java.util.List;

public interface AdminService {
    public List<Admin> adminLogin(String adminName, String adminPassword);
}
