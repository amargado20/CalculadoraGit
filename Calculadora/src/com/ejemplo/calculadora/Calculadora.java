package com.ejemplo.calculadora;
import java.util.Scanner;

public class Calculadora {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, total; 
		String operacion;
		
		System.out.println("Escribe tu primer numero: ");
		a = sc.nextDouble();
		
		System.out.println("Escribe tu segundo numero: ");
		b = sc.nextDouble();
		
		System.out.println("Escribe el simbolo de la operacion que quieras hacer: ");
		operacion = sc.next();
		
		switch (operacion) {
		case "+":
			total = sumar(a, b);
			break;
		case "-":
			total = restar(a, b);
			break;
		case "*":
			total = multiplicar(a, b);
			break;
		case "/":
				total = dividir(a, b);
				break;
			} 
		
		
		
	}
	
		 public static double sumar(double a, double b) {
		 return a + b;
		 }
		 
		 public static double restar(double a, double b) {
			 return a - b;
			}
		 
		 public static double multiplicar(double a, double b) {
			 return a * b;
			}
		 
		 public static double dividir(double a, double b) {
			 if (b == 0) {
			 throw new IllegalArgumentException("No se puede dividir entre cero");
			 }
			 return a / b;
			}

}
