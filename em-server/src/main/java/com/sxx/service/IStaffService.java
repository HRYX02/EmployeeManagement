package com.sxx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sxx.pojo.Staff;

/**
 * @author SHIXINXI
 * @create 2023-02-24-16:26
 */
public interface IStaffService extends IService<Staff> {

    @Override
    boolean save(Staff staff);
}
