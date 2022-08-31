package com.olabiciclogoogle.aula004;

public class Exercises {
	public static void main(String[] args) {
		
		exercicioI();
		
		exercicioII(11);
		
		exercicioReforco(455);
	}

	public static void exercicioI() {
		/*
		 * { Exercicio coletivo I
		 *   Escreva um programa que pegue as iniciais a partir de seu nome completo e as
		 *   exiba.
		 */

		String name = "Marlene Vasconcelos Moraes de Oliveira";

		System.out.print("Iniciais do nome: ");

		for (int i = 0; i < name.length(); i++) {
			if (i == 0)
				System.out.print(name.charAt(i));

			if (name.charAt(i) == ' ') {
				if (name.charAt(i + 1) != 'd')
					System.out.print(name.charAt(i + 1));
			}
		}
	}

	public static void exercicioII(int n) {
		/*
		 * { Exercicio coletivo II
		 *   Construa um programa que exiba todos os numeros primo de 1 a N utilizando o
		 *   tempo de complexidade O(N^2) para a construcao do algoritmo.
		 */

		int flag;

		for (int i = 1; i <= n; i++) {
			if (i == 1 || i == 0)
				continue;

			flag = 1;

			for (int j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}

			if (flag == 1)
				System.out.print(i + " ");
		}
	}

	public static int exercicioReforco(int n) {
		/*
		 * { Exercicio de Reforco
		 * 	 Escreva um metodo que calcule o maior fator primo de um determinado numero. 
		 *   Por exemplo: Os fatores primos de 455 sao 5, 7, 13.
		 */

		int flag = -1;

		for(int i = 2; i * i <= n; i++){
		   if (i == 1)
			   break;

			if (n % i != 0)
			   continue;

		   flag = i;
		   
			while(n % i == 0)
				n /= i;
		}
		
		return n == 1 ? flag : n;
	}
}

