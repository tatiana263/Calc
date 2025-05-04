package co.edu.unbosque.controller;

import java.util.Scanner;

public class calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: División por cero");
            return Double.NaN;  
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        calculadora calc = new calculadora();
        
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Suma: " + calc.sumar(num1, num2));
        System.out.println("Resta: " + calc.restar(num1, num2));
        System.out.println("Multiplicación: " + calc.multiplicar(num1, num2));
        System.out.println("División: " + calc.dividir(num1, num2));
        
        scanner.close();
    }
}