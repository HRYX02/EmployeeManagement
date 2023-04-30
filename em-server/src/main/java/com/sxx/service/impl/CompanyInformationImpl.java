package com.sxx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sxx.dao.CompanyInformationDao;
import com.sxx.entity.StaffPO;
import com.sxx.service.ICompanyInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @description 首页公司信息的实现类
 * @author SHIXINXI
 * @create 2023-03-27-9:31
 */

@Service
public class CompanyInformationImpl extends ServiceImpl<CompanyInformationDao, StaffPO> implements ICompanyInformation {

    @Autowired
    private CompanyInformationDao companyInformationDao;

    /**
     * 公司男女比例的方法
     */
    @Override
    public Map<String, Integer> genderRatio() {
        Integer sex = null;
        LambdaQueryWrapper lambdaQueryWrapperFemale = new LambdaQueryWrapper();
        lambdaQueryWrapperFemale.eq(sex != null,"sex",0);
        LambdaQueryWrapper lambdaQueryWrapperMale = new LambdaQueryWrapper();
        lambdaQueryWrapperFemale.eq(sex != null,"sex",1);

        Map<String,Integer> map = new HashMap<>();
        Integer Female = companyInformationDao.selectCount(lambdaQueryWrapperFemale);
        map.put("Female",Female);
        Integer Male = companyInformationDao.selectCount(lambdaQueryWrapperMale);
        map.put("Male",Male);
        return map;
    }
}
