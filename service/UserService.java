package com.service;

import com.pojo.User;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface UserService {

    public List<User> list();

    void save(User user, long[] roleIds);

    void delByUserId(int userId);
}
