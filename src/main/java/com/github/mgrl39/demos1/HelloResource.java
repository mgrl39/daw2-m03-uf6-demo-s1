package com.github.mgrl39.demos1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


// La clase RestController l'hem definit un endpoint principal, i totes les opcions apunten al endpoint general
// Per tant tenim /hello,  /hello/bye y /hello/bye
@RestController // l'hi diu a Spring que aixo es un endpoint., nomes hi haura una en tot el document crec
@RequestMapping(HelloResource.HELLO_RESOURCE)
public class HelloResource {

    public static final String HELLO_RESOURCE = "/hello";

    @GetMapping() // aqui tenim definida el get sobre aquest metode d'aqui.
    // el request param es el nom de la propietat. Hi hagi un valor o no el string contindra el valor que
    // l'hi passem en el request param. Que fa aixo? fa un return d'un string.

    /*
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }*/

    public Hello hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Hello(name);
    }

    // http://localhost:8080/hello/bye?name=DAW
    @GetMapping("/bye")
    public String bye(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/test")
    public String test(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello Test!", name);
    }

    // Si anem a localhost:8080/ es error.
    // Si anem a localhost:8080/name es Hello World!
    // Si anem a localhost:8080/name?=test apareix Hello test!

    // Si en comptes de fer un return de String faig un Return d'un objecte retorna JSON doncs
}
