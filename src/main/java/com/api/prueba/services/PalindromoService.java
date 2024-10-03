package com.api.prueba.services;

import com.api.prueba.models.Entrada;
import com.api.prueba.models.Salida;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class PalindromoService {
    public Salida procesarCadena(Entrada entrada) {
        String cadena = entrada.getPalindromo();
        int lengthCadena = cadena.length();

        // Verificar si es un palíndromo a través de una expresión regular. Donde elimina los espacios vacíos y convierte los caracteres a minúsculas
        String cadenaSinEspacios = cadena.replaceAll("\\s+", "").toLowerCase();
        boolean esPalindromo = cadenaSinEspacios.equals(new StringBuilder(cadenaSinEspacios).reverse().toString());


        // La clase matcher se va a envargar de buscar coincidencias entre los caracteres de la cadena y la expresión regular
        String regex = "[^\\w\\s]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cadena);
        int lengthCaracteresEspeciales = 0;
        while (matcher.find()) {
            lengthCaracteresEspeciales++;
        }

        // Se asignan los valores al modelo "Salida"
        Salida salida = new Salida();

        salida.setLengthCadena(lengthCadena);
        salida.setIsPalindromo(esPalindromo ? 1 : 0);
        salida.setLengthCaracteresEspeciales(lengthCaracteresEspeciales);

        return salida;
    }
}
