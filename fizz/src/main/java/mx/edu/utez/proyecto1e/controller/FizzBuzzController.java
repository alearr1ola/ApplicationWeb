package mx.edu.utez.proyecto1e.controller;


import mx.edu.utez.proyecto1e.DTO.Alumno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {

    @GetMapping("/fizzbuzz/{n}")
    public Alumno fizzBuzz(@PathVariable int n) {

        // Recorro desde 1 hasta n
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
        Alumno alumno = new Alumno("Alexis Arriola Martinez");
        return alumno;
    }
}