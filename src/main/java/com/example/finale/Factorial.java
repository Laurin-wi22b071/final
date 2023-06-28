package com.example.finale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Factorial {
        private int total;
        @GetMapping("api/factorial")
        public int getFactor(@RequestParam int number) {
            int faktor = 1;
            for(int i = 1; i <= number; i++) {
                faktor *= i;
            }
            this.total = this.total + faktor;
            return faktor;
        }

        @GetMapping("api/factorial/total")
        public int getTotal() {
            return this.total;
        }

}
