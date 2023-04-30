package com.sxx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sxx.entity.StaffPO;

import java.util.Map;

/**
 * @description 首页公司信息的接口
 * @author SHIXINXI
 * @create 2023-03-27-9:30
 */
public interface ICompanyInformation extends IService<StaffPO> {
    /**
     * 公司男女比例的接口
     *
     * @return 男女员工数
     */
    Map<String, Integer> genderRatio();
}
