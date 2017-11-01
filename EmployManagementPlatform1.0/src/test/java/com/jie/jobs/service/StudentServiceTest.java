package com.jie.jobs.service;

import com.jie.jobs.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jiefeng on 2017/5/17.
 */
//指定测试的程序是Spring程序
@RunWith(SpringJUnit4ClassRunner.class)
//为测试类指定Spring配置文件的路径
@ContextConfiguration(locations = "file:E:/workspace/GraduationProject/EmployManagementPlatform1.0/src/main/resources/config/spring/applicationContext.xml")
public class StudentServiceTest
{
    @Test
    public  void addStudentTest() throws Exception
    {
        Student student = new Student();
        student.setStuname("冯杰");
        student.setStuno("201307254");
        student.setStuidcard("370724199407265152");
        student.setStugender("1");
        student.setStunation("1");
        student.setStubirth("2017-09-09");
        student.setStupolitical("1");
        student.setStutype("1");
        student.setStuemail("1@163.com");
        student.setStunative("1");
        student.setStunativecode("1");
        student.setStudep("1");
        student.setStumajor("1");
        student.setStutel("13791851374");
        student.setStuaddr("山东省潍坊市");
        student.setStuaddrcode("262600");
        service.addStudent(student);
    }
    @Autowired
    private StudentService service = null;
}
