package com.tjfae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.tjfae"})
public class TjfaeDiscoverDeployApplication {

    public static void main(String[] args) {
        SpringApplication.run(TjfaeDiscoverDeployApplication.class, args);
    }

}
