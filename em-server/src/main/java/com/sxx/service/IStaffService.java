package com.sxx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sxx.entity.StaffPO;

/**
 * @author SHIXINXI
 * @create 2023-02-24-16:26
 */
public interface IStaffService extends IService<StaffPO> {

    @Override
    boolean save(StaffPO staff);
}
