package com.jie.jobs.service.impl;

import com.jie.jobs.dao.StudentMapper;
import com.jie.jobs.dao.UserMapper;
import com.jie.jobs.domain.Student;
import com.jie.jobs.domain.User;
import com.jie.jobs.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jiefeng on 2017/4/18.
 */
@Service
@Transactional
class StudentServiceImpl implements StudentService
{
    private static Logger logger = Logger.getLogger(StudentServiceImpl.class);
    public void addStudent(Student student) throws Exception
    {
        logger.info("进入注册service");
        logger.info(student);
        studentMapper.addStudent(student);
        logger.info("注册成功后["+student+"]");
        /*以下往用户表中存入信息*/
        User user = new User();
        user.setUserloginname(student.getStuno());

        /*初始密码设置为身份证后六位*/
        String stuidcard = student.getStuidcard();
        int len = stuidcard.length();
        String pass = stuidcard.substring(len-6);

        user.setUsername(student.getStuname());
        user.setUserpass(pass);
        user.setUserstatus("1");
        user.setUsersid(student.getStuid());
        user.setUsertype("2");
        //userMapper.addUser(user);
    }

    @Autowired
    private StudentMapper studentMapper = null;
    @Autowired
    private UserMapper userMapper = null;
}
