package com.example.demo.mybatisplus.service.impl;

import com.example.demo.mybatisplus.pojo.User;
import com.example.demo.mybatisplus.mapper.UserMapper;
import com.example.demo.mybatisplus.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
