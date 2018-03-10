package com.pawlang;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("7.1 = " + calc.add(2.5,4.6));
        System.out.println("-----------------------");
        System.out.println("-2.0 = " + calc.sub(2,4));
        System.out.println("-----------------------");
        System.out.println("-6.0 = " + calc.mul(2,-3));
        System.out.println("-----------------------");
        System.out.println("-0.75 = " + calc.div(-3,4));
        System.out.println("-----------------------");
        System.out.println(calc.div(2,0));
        System.out.println("-----------------------");
        System.out.println("Sin = " + calc.sin(45));
        System.out.println("-----------------------");
        System.out.println("Cos = " + calc.cos(45));
        System.out.println("-----------------------");
        System.out.println("Fib(6) = " + calc.fib(6));
    }
}
