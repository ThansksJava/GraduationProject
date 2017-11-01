package com.jie.jobs.web.controller;

import com.jie.jobs.domain.Job;
import com.jie.jobs.domain.Student;
import com.jie.jobs.service.JobService;
import com.jie.jobs.service.StudentService;
import net.sf.json.JSONArray;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jiefeng on 2017/5/20.
 */
@Controller
public class StudentController
{
    /*学生注册*/
    @RequestMapping("/regist.do")
    @ResponseBody
    public Map<String,String> regist(Student student) throws Exception
    {
        logger.info("进入注册控制器regist");
        Map<String,String> data = new HashMap<String, String>();
        studentService.addStudent(student);
        data.put("result","success");
        return data;
    }
    /*查询岗位信息*/
    @RequestMapping(value="/findAllJobs.do",method = RequestMethod.POST,
            produces = "text/json;charset=UTF-8")
    @ResponseBody()
    public String findAllJobs() throws Exception
    {
        logger.info("进入查询岗位信息控制器findAllJobs");
        List<Job> jobs = jobService.findAllJobs();
        String allJobs = JSONArray.fromObject(jobs).toString();
        logger.info("allJobs"+allJobs);
        return allJobs;
    }
    @Autowired
    private JobService jobService = null;
    @Autowired
    private StudentService studentService = null;
    private static Logger logger = Logger.getLogger(StudentController.class);
}
