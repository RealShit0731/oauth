package com.gosafe.oauth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * @author Jean
 * @email yuanjie1995@foxmail.com
 * @date 2019-06-02 14:24:49
 */
@Data
@TableName("oauth_access_token")
public class SysAccessTokenEntity implements Serializable {

    private static final long serialVersionUID = -987452529398218233L;

    @TableId(type = IdType.INPUT)
    private String authenticationId;
    private String tokenId;
    private String token;
    private String userName;
    private String clientId;
    private String authentication;
    private String refreshToken;

}
