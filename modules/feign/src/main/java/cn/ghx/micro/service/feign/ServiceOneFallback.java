package cn.ghx.micro.service.feign;

public class ServiceOneFallback implements ServiceOne{
    @Override
    public String name() {
        return "Service One name Service is down.";
    }
}
