package com.sxx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sxx.entity.StaffPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author SHIXINXI
 * @create 2023-02-24-8:10
 */

@Mapper
@Repository
public interface StaffDao extends BaseMapper<StaffPO>{

}
