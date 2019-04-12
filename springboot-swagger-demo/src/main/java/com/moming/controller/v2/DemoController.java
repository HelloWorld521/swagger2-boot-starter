package com.moming.controller.v2;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * example
 *
 * @author hjy
 * @date 2019/4/12
 **/
@Api("业务相关接口")
@RestController
public class DemoController {

    @ApiOperation("查询业务列表")
    @GetMapping("/findDemoList")
    public String findDemoList() {
        return "业务列表内容";
    }

}
