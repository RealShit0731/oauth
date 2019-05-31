# Spring security oauth2


### 默认端点

```
- /oauth/authorize：授权端点
- /oauth/token：令牌端点
- /oauth/confirm_access：用户确认授权提交端点
- /oauth/error：授权服务错误信息端点
- /oauth/check_token：用于资源服务访问的令牌解析端点
- /oauth/token_key：提供公有密匙的端点，如果你使用 JWT 令牌的话
```

### 请求链接

**获取授权码**
` http://localhost:8080/oauth/authorize?client_id=client&response_type=code`
> 第一次访问会跳转到登录页面
  
![GitHub set up](https://www.funtl.com/assets1/Lusifer_20190401195014.png )[spring security 默认登陆页](url)

选择授权后会跳转到授权服务器里配置的客户端信息，浏览器地址上还会包含一个授权码（code=1JuO6V），浏览器地址栏会显示如下地址：

` http://www.funtl.com/?code=1JuO6V `

**获取授权码**

通过 CURL 或是 Postman 请求

```
curl -X POST -H "Content-Type: application/x-www-form-urlencoded" -d 'grant_type=authorization_code&code=1JuO6V' "http://client:secret@localhost:8080/oauth/token"
```
![GitHub set up](https://www.funtl.com/assets1/Lusifer_20190402232952.png )[](url)


