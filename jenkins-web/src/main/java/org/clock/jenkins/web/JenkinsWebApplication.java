package org.clock.jenkins.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author clock
 * @date 2019-06-10 13:32
 */
@RestController
@SpringBootApplication
public class JenkinsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsWebApplication.class, args);
    }

    @ResponseBody
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello World!";
    }

}
