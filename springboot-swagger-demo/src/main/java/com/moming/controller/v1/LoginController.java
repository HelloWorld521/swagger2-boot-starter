package com.moming.controller.v1;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Login
 *
 * @author hjy
 * @date 2019/4/12
 **/
@Api("登录相关接口")
@RestController
public class LoginController {

    @ApiOperation("登录")
    @GetMapping("/login")
    public String login() {
        return "欢迎登录";
    }

    @ApiOperation("校验用户名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "string", paramType = "query")
    })
    @GetMapping("/checkUsername")
    public Boolean checkUsername(String username) {
        return true;
    }

}
