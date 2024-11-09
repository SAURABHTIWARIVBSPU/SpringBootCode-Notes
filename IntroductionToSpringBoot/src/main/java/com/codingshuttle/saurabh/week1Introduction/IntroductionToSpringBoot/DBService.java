package com.codingshuttle.saurabh.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

     @Autowired
  private   DB db;
     String getdata(){
          return db.getData();
     }
}
