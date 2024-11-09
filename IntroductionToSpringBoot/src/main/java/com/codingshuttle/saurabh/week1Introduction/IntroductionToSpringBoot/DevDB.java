package com.codingshuttle.saurabh.week1Introduction.IntroductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@ConditionalOnProperty(name="deploy.env", havingValue="devlopment")
public class DevDB implements DB{
    public String getData(){
        return "Dev Data";
    }
}
