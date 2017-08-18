package com.qee.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Created by hzzhuqi1 on 2017/8/18.
 */
@EnableAutoConfiguration
public class CrawlerApp {
    public static void main(String[] args) {
        SpringApplication.run(CrawlerApp.class, args);
    }
}
