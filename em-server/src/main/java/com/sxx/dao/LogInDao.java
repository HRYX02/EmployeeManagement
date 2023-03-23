package com.sxx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sxx.pojo.LogIn;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author SHIXINXI
 * @create 2023-03-08-19:03
 */

@Mapper
@Repository
public interface LogInDao extends BaseMapper<LogIn> {
}
