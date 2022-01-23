package com.mino.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void  main(String[] args) {
        // 얘로 인해 내장 WAS를 실행한다.
        SpringApplication.run(Application.class, args);
    }
}
