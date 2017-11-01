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
public class JobServiceTest
{
    @Test
    public  void findAllJobsTest() throws Exception
    {
        System.out.println(service.findAllJobs());

    }
    @Autowired
    private JobService service = null;
}
