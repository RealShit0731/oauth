package com.gosafe.oauth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gosafe.oauth.mapper.SysClientDetailsMapper;
import com.gosafe.oauth.service.SysClientDetailsService;
import org.springframework.stereotype.Service;

import com.gosafe.oauth.entity.SysClientDetailsEntity;


@Service("oauthClientDetailsService")
public class SysClientDetailsServiceImpl extends ServiceImpl<SysClientDetailsMapper, SysClientDetailsEntity> implements SysClientDetailsService {

}