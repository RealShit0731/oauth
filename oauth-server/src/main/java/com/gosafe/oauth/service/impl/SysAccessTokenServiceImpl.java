package com.gosafe.oauth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gosafe.oauth.entity.SysAccessTokenEntity;
import com.gosafe.oauth.mapper.SysAccessTokenMapper;
import com.gosafe.oauth.service.SysAccessTokenService;
import org.springframework.stereotype.Service;


@Service("oauthAccessTokenService")
public class SysAccessTokenServiceImpl extends ServiceImpl<SysAccessTokenMapper, SysAccessTokenEntity> implements SysAccessTokenService {


}