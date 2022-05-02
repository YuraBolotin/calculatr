package com.bolotin.calculatr;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{


    @Override
    public int plus(int num1, int num2) {
        return num1+num2;
    }
    @Override
    public int minus(int num1, int num2) {
        return num1-num2;
    }
    @Override
    public int multiply(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public String divide(double num1, double num2) {

        if (num2 == 0) {
            return "На ноль делить нельзя";

        }
        return num1 + " / " +  num2 + " = " + num1/num2;
    }


}
