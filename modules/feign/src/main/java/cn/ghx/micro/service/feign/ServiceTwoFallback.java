package cn.ghx.micro.service.feign;

public class ServiceTwoFallback implements ServiceTwo{
    @Override
    public String name() {
        return "Service Two name Service is down.";
    }
}
