# swagger2-boot-starter

## 介绍
springboot 自动装配 swagger2

## 如何使用
1. 添加 pom 文件
    ```xml
        <dependency>
            <groupId>com.github.helloworld521</groupId>
            <artifactId>swagger2-boot-starter</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>
    ```
2. 参数配置
    ```properties
    swagger2:
        groups:
            v1:
              basePackage: com.moming.controller.v1
              title: 登录相关
            v2:
              basePackage: com.moming.controller.v2
              title: 业务相关
              description: 业务说明
    ```

## 案例
见本项目 springboot-swagger-demo

