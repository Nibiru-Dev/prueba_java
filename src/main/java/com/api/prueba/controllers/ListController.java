package com.api.prueba.controllers;

import com.api.prueba.models.User;
import com.api.prueba.services.ExternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api-externa")
public class ListController {
    private ExternalService externalService;

    @Autowired
    public ListController(ExternalService externalService) {
        this.externalService = externalService;
    }

    @GetMapping(value = "listar", headers = "Accept=application/json")
    public List<User> listarUsers(){
        return externalService.getExternalData();
    }

    



}
