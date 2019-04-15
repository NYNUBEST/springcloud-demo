# Spring Cloud Demo

A demo for spring cloud framework, build with gradle.

## Start up sequence

1. ConfigApp  => `config center`
2. EurekaApp => `service register center` 
3. Service*App => `business service` 
4. ZuulApp => `api gateway`
5. FeignApp => `rest service client`

## Todo

- [ ] Hystrix Dashboard with Turbine

## How to Test

- Service one provide service 
  - `http://localhost:8081/name` => `Service One`
- Service two provide service 
  - `http://localhost:8082/name` => `Service Two`
- Zuul proxy above service
  - `http://localhost:8080/one/name` => `http://localhost:8081/name`  => `Service One`
  - `http://localhost:8080/two/name` => `http://localhost:8082/name` => `Service Two`
- Feign client invoke above two service
  - `http://localhost:8083/name`
    - `http://localhost:8081/name`  => `Service One`
    - `http://localhost:8082/name` => `Service Two`

## Relationship


![](doc/relationship.png)

![](doc/relationship2.png)


## References

- [Build a sample project with spring cloud using cloud config, eureka, zuul, feign, hystrix and turbine](https://medium.com/@27.rahul.k/build-a-sample-project-with-spring-cloud-using-cloud-config-eureka-zuul-feign-hystrix-and-378b16bcb7c3)