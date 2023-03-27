package com.sxx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sxx.dao.CompanyInformationDao;
import com.sxx.pojo.Staff;
import com.sxx.service.ICompanyInformation;
import org.springframework.stereotype.Service;

/**
 * @author SHIXINXI
 * @create 2023-03-27-9:31
 */

@Service
public class CompanyInformationImpl extends ServiceImpl<CompanyInformationDao, Staff> implements ICompanyInformation {

}
