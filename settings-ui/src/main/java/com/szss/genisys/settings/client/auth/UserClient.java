package com.szss.genisys.settings.client.auth;



import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.szss.commons.web.json.JsonPage;
import com.szss.genisys.settings.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Service;


/**
 * Created by zcg on 16/2/29.
 */
@Service
public class UserClient {
    @Autowired
    @LoadBalanced
    private OAuth2RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "findFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.strategy", value = "SEMAPHORE"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "1000") })
    public JsonPage<User> find(String name, String username, int page, int size) {
        ParameterizedTypeReference responseType=new ParameterizedTypeReference<JsonPage<User>>() {};
        ResponseEntity<JsonPage<User>> responseEntity= restTemplate.exchange(String.format("http://auth-service/uaa/api/users/findAll?name=%s&username=%s&page=%d&size=%d",name,username,page,size), HttpMethod.GET,null,responseType);
        return responseEntity.getBody();
    }

    private JsonPage<User> findFallback(String name,String username,int page, int size) {
		return null;
    }

}
