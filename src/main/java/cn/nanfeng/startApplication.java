package cn.nanfeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class startApplication {
    public static void main(String[] args) {
        SpringApplication.run(startApplication.class);
    }
}
