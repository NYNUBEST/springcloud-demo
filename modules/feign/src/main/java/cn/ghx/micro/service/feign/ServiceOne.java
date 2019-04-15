package cn.ghx.micro.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-one",fallback = ServiceOneFallback.class)
public interface ServiceOne {
    @GetMapping(value = "/name")
    String name();
}
