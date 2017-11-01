package com.jie.jobs.dao;

import com.jie.jobs.domain.Company;

/**
 * Created by jiefeng on 2017/5/18.
 */
public interface CompanyMapper
{
    public boolean addCompay(Company student);
	public boolean delCompany(int id);
}
