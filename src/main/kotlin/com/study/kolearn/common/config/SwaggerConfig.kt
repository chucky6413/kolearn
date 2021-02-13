package com.study.kolearn.common.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.Tag
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@EnableSwagger2
@Configuration
class SwaggerConfig {
    companion object {
        const val MEMBER_TAG = "MEMBER"
    }

    @Bean
    fun api(): Docket = Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.study.kolearn"))
        .paths(PathSelectors.ant("/api/**"))
        .build()
        .tags(Tag(MEMBER_TAG, "$MEMBER_TAG Apis"))
        .useDefaultResponseMessages(false)
}