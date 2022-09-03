package com.olabiciclogoogle.aula007;

/**
 * @author Marlene
 * @date 04-29-2022
 * 
 * Modulo 1: Algoritmo e Estrutura de Dados 
 * Aula 007: LeetCode Exercicios
 */

public class Application {

	public static void main(String[] args) {
		System.out.println(romanToInt("IX"));
		System.out.println(romanToInt("XI"));
		System.out.println(romanToInt("L"));
		System.out.println(romanToInt("XL"));
	}

	// Solution: RomanToInteger
	public static int romanToInt(String s) {
		int number = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char add = s.charAt(i);
			switch (add) { // incremento
			case 'I':
				number += 1;
				break;
			case 'V':
				number += 5;
				break;
			case 'X':
				number += 10;
				break;
			case 'L':
				number += 50;
				break;
			case 'C':
				number += 100;
				break;
			case 'D':
				number += 500;
				break;
			case 'M':
				number += 1000;
				break;
			}
		}
		
		for (int i = 0; i < s.length() - 1; i++) {
			String substring = s.substring(i, i + 2);
			switch (substring) {
			case "IV":
			case "IX":
				number -= 2;
				break;
			case "XC":
			case "XL":
				number -= 20;
				break;
			case "CD":
			case "CM":
				number -= 200;
				break;
			}
		}

		return number;
	}
	
}
