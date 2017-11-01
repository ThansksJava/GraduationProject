package com.jie.jobs.web.controller;
import com.jie.jobs.domain.Student;
import com.jie.jobs.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiefeng on 2017/4/1.
 */
@Controller
public class CommonController
{
    @Autowired
    private StudentService service = null;
    private static Logger logger = Logger.getLogger(CommonController.class);
    /*登录*/
    @RequestMapping("/login.do")
    @ResponseBody
    public Map<String,String> login(String username,String password)
    {
        logger.info("进入登录控制");
        Map<String,String> data = new HashMap<String, String>();
        data.put("result","success");
        return data;
    }
    /*企业注册*/
}
