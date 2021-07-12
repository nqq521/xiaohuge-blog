package com.llh.shardingjdbc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.llh.shardingjdbc.entity.Permission;
import com.llh.shardingjdbc.mapper.PermissionMapper;
import com.llh.shardingjdbc.service.PermissionService;
import org.springframework.stereotype.Service;

/**
 * @author 小虎哥的技术博客
 **/
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {
}
