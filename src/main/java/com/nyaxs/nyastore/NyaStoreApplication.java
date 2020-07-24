package com.nyaxs.nyastore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.nyaxs.nyastore.mapper")
public class NyaStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(NyaStoreApplication.class, args);
    }

}
