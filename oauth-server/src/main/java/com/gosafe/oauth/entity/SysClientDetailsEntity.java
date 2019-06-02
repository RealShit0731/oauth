package com.gosafe.oauth.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import lombok.Data;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;

/**
 * @author Jean
 * @email yuanjie1995@foxmail.com
 * @date 2019-06-02 14:24:49
 */
@Data
@TableName("oauth_client_details")
public class SysClientDetailsEntity implements Serializable {

    private static final long serialVersionUID = -5277805708339043209L;

    /**
     * TODO:参数待修改
     */
    @TableId
    private String clientId;
    private String resourceIds;
    private String clientSecret;
    private String scope;
    private String authorizedGrantTypes;
    private String webServerRedirectUri;
    private String authorities;
    private Integer accessTokenValidity;
    private Integer refreshTokenValidity;
    private String additionalInformation;
    private String autoapprove;

}
