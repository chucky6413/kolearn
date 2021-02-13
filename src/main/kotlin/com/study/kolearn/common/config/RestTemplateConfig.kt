package com.study.kolearn.common.config

import org.apache.http.impl.client.HttpClientBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.web.client.RestTemplate

@Configuration
class RestTemplateConfig {
    @Bean
    fun restTemplate(): RestTemplate {
        val httpRequestFactory = HttpComponentsClientHttpRequestFactory()
        httpRequestFactory.setConnectTimeout(2000)
        httpRequestFactory.setReadTimeout(2000)
        val httpClient = HttpClientBuilder.create()
            .setMaxConnTotal(200)
            .setMaxConnPerRoute(20)
            .build()
        httpRequestFactory.httpClient = httpClient
        return RestTemplate(httpRequestFactory)
    }
}