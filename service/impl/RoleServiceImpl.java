package com.service.impl;

import com.dao.RoleDao;
import com.pojo.Role;
import com.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServiceImpl implements RoleService {


    private RoleDao roleDao;


    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public List<Role> list() {

        List<Role> roleList = roleDao.list();
        return roleList;
    }

    public void add(Role role) {
        roleDao.add(role);
    }
}
