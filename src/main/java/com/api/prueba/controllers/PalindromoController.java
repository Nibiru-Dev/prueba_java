package com.api.prueba.controllers;

import com.api.prueba.models.Entrada;
import com.api.prueba.models.Salida;
import com.api.prueba.models.User;
import com.api.prueba.services.ExternalService;
import com.api.prueba.services.PalindromoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api-interna")
public class PalindromoController {
    private PalindromoService palindromoService;

    @Autowired
    public PalindromoController(PalindromoService palindromoService) {
        this.palindromoService = palindromoService;
    }

    @PostMapping(value = "palindromo", headers = "Accept=application/json")
    public List<Salida> palindromo(@RequestBody Entrada entrada){
        Salida salida = palindromoService.procesarCadena(entrada);
        return Collections.singletonList(salida);
    }
}
