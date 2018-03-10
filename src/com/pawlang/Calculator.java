package com.pawlang;


public class Calculator {

    double add (double a, double b){
        return a+b;
    }
    double sub (double a, double b){
        return a-b;
    }
    double mul (double a, double b){
        return a*b;
    }
    double div (double a, double b){
        return a/b;
    }
    double sin (double a){
        return Math.sin(a);
    }
    double cos (double a){
        return Math.cos(a);
    }

    int fib (int a){
        int a0 = 0;
        int a1 = 1;
        for (int i = 1; i <= a; i++){
            a0 = a0 + a1;
            a1 = a0 - a1;
        }
        return a0;
    }
}
