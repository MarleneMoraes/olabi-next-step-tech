package com.olabiciclogoogle.aula005;

/**
 * @author Marlene
 * @date 04-26-2022
 * 
 * Modulo 1: Algoritmo e Estrutura de Dados 
 * Aula 005: Notacao Big O (Big Notation O) e Arrays
 */

public class Application {

	public static void main(String[] args) {
		// Big O: entrada de dados representada pela letra N

		// Big O de 1 é um retorno constante
		System.out.println(bigO1(1000));

		// Big O de n - custo muito maior e não constante
		System.out.println(bigOn(1000));

		// Big O de n2 - custo duplicado referente ao Big O de n
		System.out.println(bigOn2(1000));

		// Arrays
		String[] cities = { "Porto Alegre", "Sao Paulo", "Rio de Janeiro" };

		// retorna o tamanho do array
		System.out.println(cities.length); // 3

		// posicao elemento
		System.out.println(cities[1]); // Sao Paulo

		// percorrer array
		for (int i = 0; i < cities.length; i++)
			System.out.println(cities[i]);

		// for aprimorado
		for (String city : cities)
			System.out.println(city);
		
			// outro exemplo
			int[] numbers = { 2, 60, 40, 35, 80 };
	
			int total = 0;
			for (int i : numbers)
				total += i;
	
			System.out.println(total);

	}

	public static Integer bigO1(int n) {
		return n;
	}

	public static Integer bigOn(int n) {

		for (int i = 1; i <= n; i++)
			System.out.print(i + " ");

		return n;

	}

	public static Integer bigOn2(int n) {
		int i;
		String line;

		line = " ";

		/*
		 * for (i = 1; i <= n; i++) { line = " ";
		 * 
		 * for (i = 1; i <= n; i++) { line = line + " " + n; }
		 * 
		 * System.out.println(line); }
		 */

		// O(n)
		for (i = 1; i <= n; i++) 
			line = line + " " + n;
		

		// O(n)
		for (i = 1; i <= n; i++) 
			System.out.println(line);
		

		return n;

	}
}
