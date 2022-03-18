package com.sofka.proyect.example;

public class Taller1_ProgramacionFuncional {
    public static void main(String[] args) {

        System.out.println(multiplicar(5, 69));
        System.out.println(dividir(480, 12));

    }
    public static int sumar(int num1, int num2){
        return num1 + num2;
    }

    public static int restar(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
            if(num2==0 || num1==0)
                return 0;
            else
                return sumar(num1, multiplicar(num1,restar(num2,1)));
    }

    public static int dividir(int num1, int num2){
        if (num2>num1)
            return 0;
        else
            return (sumar(dividir(restar(num1, num2),num2), 1));
    }

}



