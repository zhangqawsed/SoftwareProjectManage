package com.service.impl;

import com.dao.RoleDao;
import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.pojo.Role;
import com.pojo.User;
import com.service.UserService;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class UserServiceImpl implements UserService {

   private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public List<User> list() {
        List<User> userList = userDao.list();

        for (User user : userList) {
            int id = user.getId();
            List<Role> roleList=roleDao.selectByUserId(id);
            user.setRoleList(roleList);
        }
        return  userList;
    }

    public void save(User user, long[] roleIds) {
        int userId = userDao.save(user);

        userDao.saveRoleRel(userId,roleIds);
    }

    public void delByUserId(int userId) {
        userDao.delByUserId(userId);
    }


}
