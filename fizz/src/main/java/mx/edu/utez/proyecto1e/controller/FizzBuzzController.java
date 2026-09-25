package mx.edu.utez.proyecto1e.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.coyote.http11.Constants.a;

@RestController
public class FizzBuzzController {

    @GetMapping("/fizzbuzz/{n}")
    public String fizzBuzz(@PathVariable int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
        return "Alexis Arriola Martinez";
    }

        @GetMapping("/fibonacci/{n}")
        public String generarFibonacci(@PathVariable int n) {

        if (n <= 0) {
                return "Arriola mtz Alexis";
            }
            int[] fib  = new int[2];

            fib[0] = 0;
            fib[1] = 1;

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    System.out.println(fib[0]);
                } else if (i == 1) {
                    System.out.println(fib[1]);
                } else {
                    int siguiente = fib[0] + fib[1];

                    fib[0] = fib[1];
                    fib[1] = siguiente;

                    System.out.println(fib[1]);
                }
            }
            return "Arriola Maltinez Aletsis ";
    }
}