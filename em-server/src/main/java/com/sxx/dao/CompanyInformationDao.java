package com.sxx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sxx.entity.StaffPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @description Vue首页显示数据的调用接口
 * @author SHIXINXI
 * @create 2023-03-27-9:27
 */

@Mapper
@Repository
public interface CompanyInformationDao extends BaseMapper<StaffPO> {
}
