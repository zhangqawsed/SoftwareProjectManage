package com.service;

import com.pojo.Role;

import java.util.List;

public interface RoleService {
    public List<Role> list();

    public void add(Role role);
}
