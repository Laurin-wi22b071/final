package com.example.finale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Factorial {

    @GetMapping("api/factorial")
    public int getFactor(@RequestParam int number) {
        int summe = 0;
        int faktor = 1;
        for(int i = 1; i <= number; i++) {
            faktor *= i;
        }
        summe += faktor;
        return faktor;
    }




}
