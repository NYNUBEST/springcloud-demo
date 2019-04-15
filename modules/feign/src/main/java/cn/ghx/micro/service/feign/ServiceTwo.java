package cn.ghx.micro.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-two",fallback = ServiceTwoFallback.class)
public interface ServiceTwo {
    @GetMapping(value = "/name")
    String name();
}
