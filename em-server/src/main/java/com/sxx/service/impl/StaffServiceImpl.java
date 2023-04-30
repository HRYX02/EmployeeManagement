package com.sxx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sxx.dao.StaffDao;
import com.sxx.entity.StaffPO;
import com.sxx.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description 公司所有员工的实现类
 * @author SHIXINXI
 * @create 2023-02-24-16:28
 */

@Service
public class StaffServiceImpl extends ServiceImpl<StaffDao, StaffPO> implements IStaffService {

    @Autowired
    private StaffDao staffDao;

    /**
     * 添加用户前检查emp_id是否重复
     */
    @Override
    public boolean save(StaffPO staff) {

        QueryWrapper<StaffPO> queryWrapper = new QueryWrapper();
        queryWrapper.eq("emp_id",staff.getEmpId());
        if (staffDao.selectOne(queryWrapper) == null){
            return staffDao.insert(staff) > 0;
        }else {
            return false;
        }
    }
}
