package com.example.demo.mybatisplus.mapper;

import com.example.demo.mybatisplus.pojo.TblEmployee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cyc
 * @since 2023-04-19
 */
@Mapper
public interface TblEmployeeMapper extends BaseMapper<TblEmployee> {

}
