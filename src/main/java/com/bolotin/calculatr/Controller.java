package com.bolotin.calculatr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {

    public final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcomToCalculator() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return  num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return  num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);

    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return  num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam double num1, @RequestParam double num2) {
        return  calculatorService.divide(num1, num2);
    }
}