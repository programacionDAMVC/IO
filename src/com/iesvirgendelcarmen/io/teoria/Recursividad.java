package com.iesvirgendelcarmen.io.teoria;

public class Recursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 6;
		System.out.printf("El factorial de %d vale %d%n", numero,
				calcularFactorialIterativo(numero));
		System.out.printf("El factorial de %d vale %d%n", numero,
				calcularFactorialRecursivo(numero));
	}

	private static int calcularFactorialIterativo(int numero) {
		int factorial = 1;
		for (int i = numero; i > 1; i--)
			factorial *= i;
		return factorial;
	}
	
	public static int calcularFactorialRecursivo(int numero) {
		if (numero == 0)
			return 1;
		else
			return numero * calcularFactorialRecursivo(numero - 1);
	}

}
