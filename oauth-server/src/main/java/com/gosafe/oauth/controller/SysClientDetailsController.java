package com.gosafe.oauth.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gosafe.oauth.entity.SysClientDetailsEntity;
import com.gosafe.oauth.service.SysClientDetailsService;


/**
 * @author Jean
 * @email yuanjie1995@foxmail.com
 * @date 2019-06-02 14:24:49
 */
@RestController
@RequestMapping("oauth/sysClientDetails")
public class SysClientDetailsController extends ApiController {
    @Autowired
    private SysClientDetailsService sysClientDetailsService;


    /**
     * 信息
     */
    @RequestMapping("/info/{clientId}")
    public R info(@PathVariable("clientId") String clientId) {
        SysClientDetailsEntity oauthClientDetails = sysClientDetailsService.getById(clientId);

        return success(oauthClientDetails);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SysClientDetailsEntity oauthClientDetails) {
        sysClientDetailsService.save(oauthClientDetails);
        return success(null);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SysClientDetailsEntity oauthClientDetails) {
        sysClientDetailsService.updateById(oauthClientDetails);
        return success(null);
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] clientIds) {
        sysClientDetailsService.removeByIds(Arrays.asList(clientIds));

        return success(null);
    }

}
