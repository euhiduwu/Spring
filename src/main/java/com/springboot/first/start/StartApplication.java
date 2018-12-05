package com.springboot.first.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@EnableAutoConfiguration
@RestController
@RequestMapping()
//@SpringBootApplication
public class StartApplication {

    @RequestMapping("/")
    String home(HttpServletRequest request) {
        String userName = "ctrip";
        Integer count = 100;
        return "欢迎您" + userName + "， 这是您的第" + count + "次登陆";
    }

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
}
