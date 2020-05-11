package com.mdjnu.leasing.service.Impl;

import com.mdjnu.leasing.mapper.AdminMapper;
import com.mdjnu.leasing.pojo.Admin;
import com.mdjnu.leasing.pojo.AdminExample;
import com.mdjnu.leasing.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired(required = false)
    AdminMapper adminMapper;

    @Override
    public List<Admin> adminLogin(String adminName, String adminPassword) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAdminNameEqualTo(adminName).andAdminPasswordEqualTo(adminPassword);
        return adminMapper.selectByExample(adminExample);
    }
}
