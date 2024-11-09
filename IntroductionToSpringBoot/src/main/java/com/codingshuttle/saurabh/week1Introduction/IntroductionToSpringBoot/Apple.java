package com.codingshuttle.saurabh.week1Introduction.IntroductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class Apple {
    void eatApple(){
        System.out.println("I am eating the apple");
    }
    @PostConstruct
    void callThisBeforeAppleIsUsed(){
        System.out.println("Creating the apple before the use");
    }
@PreDestroy
    void callThisBeforeDestroy(){
    System.out.println("Dstroying the Apple bean ");
}
}

