package cn.ghx.micro.service.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServiceTwoApp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceTwoApp.class,args);
    }

    @GetMapping("/name")
    public String name(){
        return "Service Two";
    }
}
