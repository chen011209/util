package com.example.demo.mybatisplus.service.impl;

import com.example.demo.mybatisplus.pojo.TblEmployee;
import com.example.demo.mybatisplus.mapper.TblEmployeeMapper;
import com.example.demo.mybatisplus.service.TblEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cyc
 * @since 2023-04-19
 */
@Service
public class TblEmployeeServiceImpl extends ServiceImpl<TblEmployeeMapper, TblEmployee> implements TblEmployeeService {

}
