package com.jie.jobs.dao;

import com.jie.jobs.domain.Job;

import java.util.List;

/**
 * Created by jiefeng on 2017/5/18.
 */
public interface JobMapper
{
    public boolean addJob(Job job);
    public List<Job> findAllJobs();
}
