package com.whpu.service;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whpu.bean.User;
import com.whpu.dao.UserDao;
import com.whpu.forms.UserForm;

@Service
public class UserService {

    @Autowired
    private UserDao dao;
    
    public void regUser(UserForm userForm) throws HibernateException {
        User user = new User();
        BeanUtils.copyProperties(userForm, user);
        dao.saveObject(user);
    }

}