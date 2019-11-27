package com.lizq.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@EnableScheduling
@SpringBootApplication
public class LogAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LogAppApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("Log服务启动完毕");
    }

}
