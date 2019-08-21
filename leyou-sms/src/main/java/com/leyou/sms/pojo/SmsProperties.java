package com.leyou.sms.pojo;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

//@ConfigurationProperties(prefix = "ly.sms")
@Configuration
@RefreshScope
@Data
public class SmsProperties {
    @Value("${ly.sms.accessKeyId}")
    private String accessKeyId;

    @Value("${ly.sms.accessKeySecret}")
    private String accessKeySecret;

    @Value("${ly.sms.signName}")
    private String signName;

    @Value("${ly.sms.verifyCodeTemplate}")
    private String verifyCodeTemplate;

}
