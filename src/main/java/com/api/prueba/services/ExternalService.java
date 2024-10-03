package com.api.prueba.services;

import com.api.prueba.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ExternalService {
    @Autowired
    private RestTemplate restTemplate;

    @Cacheable("users")
    public List<User> getExternalData() {
        String url = "https://jsonplaceholder.typicode.com/users";
        return restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {}).getBody();
    }
}
