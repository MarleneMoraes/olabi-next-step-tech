package com.olabiciclogoogle.aula008;

import java.util.ArrayList;

/**
 * @author Marlene
 * @date 05-03-2022
 * 
 * Modulo 1: Algoritmo e Estrutura de Dados 
 * Aula 008: LeetCode Exercicios (II)
 */

public class Application {

	public static void main(String[] args) {
		//isPalindrome
		System.out.println(isPalindrome(26));
		System.out.println(isPalindrome(1001));
		
		//longestCommonPrefix
		String[] words = {"Porta", "Porteiro", "Pedra", "Pedreiro"};
		System.out.println(longestCommonPrefix(words));
		
	}

	// Solution: isPalindrome
	public static boolean isPalindrome(int x) {
		ArrayList<Integer> number = new ArrayList<Integer>();

		if (x < 0)
			return false;

		for (; x > 0; x /= 10)
			number.add(x % 10);

		for (int j = 0, k = number.size() - 1; j < k; j++, k--) {

			if (number.get(j) != number.get(k))
				return false;

		}
		return true;
	}

	// Solution: longestCommonPrefix
	public static String longestCommonPrefix(String[] strings) {
		int aux = 999;
		int id = -1;
		int letter;
		boolean isIdentic = true;
		
		for (int i = 0; i < strings.length; i++) {
			if (aux > strings[i].length())
				aux = strings[i].length();
		}
		for (int i = 0; i < aux; i++) {
			letter = strings[0].charAt(i);
			
			for (int j = 1; j < strings.length; j++) {
				if (strings[j].charAt(i) == letter) 
					isIdentic = true; 
				else {
					isIdentic = false; 
					break;
				}
			}
			
			if (isIdentic)  
				id = i;
			else
				break;
		}
		return strings[0].substring(0, id + 1); 
	}

}
