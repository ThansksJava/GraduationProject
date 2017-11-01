package com.jie.jobs.service;

import com.jie.jobs.domain.Job;
import com.jie.jobs.domain.Student;

import java.util.List;

/**
 * Created by jiefeng on 2017/4/18.
 */
public interface JobService
{
    public List<Job> findAllJobs()  throws Exception ;
}
