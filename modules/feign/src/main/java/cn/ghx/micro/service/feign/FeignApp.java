package cn.ghx.micro.service.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableFeignClients
public class FeignApp {

    @Autowired
    private ServiceOne one;

    @Autowired
    private ServiceTwo two;

    public static void main(String[] args) {
        SpringApplication.run(FeignApp.class,args);
    }

    @GetMapping("/name")
    public Map<String,String> name(){
        Map<String,String> rs =new HashMap<>();
        rs.put("one",one.name());
        rs.put("two",two.name());
        return rs;
    }
}
