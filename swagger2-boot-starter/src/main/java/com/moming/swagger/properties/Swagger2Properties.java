package com.moming.swagger.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 读取 application 配置文件
 *
 * @author hjy
 **/
@Data
@ConfigurationProperties("swagger2")
public class Swagger2Properties {

    /**
     * 分组
     */
    private Map<String, GroupInfo> groups = new LinkedHashMap<>();


    @Data
    public static class GroupInfo {
        /**
         * swagger 会解析的包路径
         */
        private String basePackage;

        /**
         * title
         */
        private String title;

        /**
         * swagger 组相关说明
         */
        private String description;
    }
}
