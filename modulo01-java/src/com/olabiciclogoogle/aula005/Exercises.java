package com.olabiciclogoogle.aula005;

public class Exercises {
	public static void main(String[] args) {
		
		exercicioI();
		
		exercicioII();
		
		//exercicioIII();
	}

	public static void exercicioI() {
		/*
		 * { Exercicio coletivo I
		 *   Busque o índice de cada elemento no array e exiba-o.
		 */
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < numbers.length; i++)
			System.out.print(i + " ");
	}

	public static void exercicioII() {
		/*
		 * { Exercicio coletivo II
		 *   Crie um array de acordo com os dados abaixo. Em seguida, implemente a
		 *   logica de remocao de elementos duplicados:
		 *   
		 *   String[] products = { "PC124X", "TP123X", "PC122X", "PD024X", "PC124X",
		 *   "NO124X"}
		 */

		String productsNoRepeat = "";
		String[] products = { "PC124X", "TP123X", "PC122X", "PD024X", "PC124X", "NO124X"};
		
		for(int i = 0; i < products.length; i++) {
			for(int j = i+1; j < products.length; j++) {
				
				if(products[i].equals(products[j]))
					products[j] = " ";
				
			}
		}
		
		
		for(String word : products) {
			if(word != " ") {
				productsNoRepeat += word + " ";
				System.out.println(word);
			}
		}
	}

	public static void exercicioIII() {
		/*
		 * { Exercicio coletivo III
		 * 	 Considerando um array Arr[] de N inteiros, encontre o subarray contigua 
		 * 	 contendo pelo menos um numero por meio de soma maxima e retorne-a.
		 */

		
	}
}

