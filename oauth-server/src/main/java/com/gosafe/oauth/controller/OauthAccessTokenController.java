package com.gosafe.oauth.controller;

import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.gosafe.oauth.entity.SysAccessTokenEntity;
import com.gosafe.oauth.service.SysAccessTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * 
 *
 * @author Jean
 * @email yuanjie1995@foxmail.com
 * @date 2019-06-02 14:24:49
 */
@RestController
@RequestMapping("oauth/oauthAccessToken")
public class OauthAccessTokenController extends ApiController {

    @Autowired
    private SysAccessTokenService sysAccessTokenService;


    /**
     * 信息
     */
    @RequestMapping("/info/{authenticationId}")
    public R info(@PathVariable("authenticationId") String authenticationId){
		SysAccessTokenEntity oauthAccessToken = sysAccessTokenService.getById(authenticationId);

        return success(oauthAccessToken);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SysAccessTokenEntity oauthAccessToken){
		sysAccessTokenService.save(oauthAccessToken);
        return success(null);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SysAccessTokenEntity oauthAccessToken){
		sysAccessTokenService.updateById(oauthAccessToken);

        return success(null);
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] authenticationIds){
		sysAccessTokenService.removeByIds(Arrays.asList(authenticationIds));
        return success(null);
    }

}
