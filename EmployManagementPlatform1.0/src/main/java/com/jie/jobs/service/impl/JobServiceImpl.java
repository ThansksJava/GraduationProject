package com.jie.jobs.service.impl;

import com.jie.jobs.dao.JobMapper;
import com.jie.jobs.domain.Job;
import com.jie.jobs.domain.Student;
import com.jie.jobs.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jiefeng on 2017/5/18.
 */
@Service
@Transactional
public class JobServiceImpl implements JobService
{
    @Override
    public List<Job> findAllJobs() throws Exception {
        return jobMapper.findAllJobs();
    }

    @Autowired
    private JobMapper jobMapper = null;
}
