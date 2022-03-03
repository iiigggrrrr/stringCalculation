package com.iiigggrrrr.stringCalculation;

import calculator.MyCalculator;
import exceptions.IllegalExpressionFormatException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(MyCalculator.calculate("1 + 2 - 3^-3"));
        } catch (IllegalExpressionFormatException e) {
            e.printStackTrace();
        }
    }
}
