package com.olabiciclogoogle.aula003;

/**
 * @author Marlene
 * @date 04-19-2022
 * 
 * Módulo 1: Algoritmo e Estrutura de Dados Aula 003: Manipulacao de
 * strings - Concat, toLowerCase, toUpperCase, indexOf, lastIndexOf
 */

public class Application {

	public static void main(String[] args) {
		// Metodo Concat: concatenacao de Strings
		System.out.println(concatMethod());

		// Metodo toLowerCase: transformar a frase com todas as letras minusculas
		System.out.println(toLowerCaseMethod());

		// Metodo toLowerCase: transformar a frase com todas as letras maiusculas
		System.out.println(toUpperCaseMethod());

		// Metodo indexOf: localiza a posicao da primeira ocorrencia de um caractere -
		// case sensitive
		System.out.println(indexOfMethod());

		// Metodo lastOf: localiza a posicao da ultima ocorrencia de um caractere - case
		// sensitive
		System.out.println(lastIndexMethod());
	}

	public static String concatMethod() {
		String text1 = "Now, they are ";
		String text2 = "using the Concat() method";

		// String text = text1 + text2;
		return text1.concat(text2);
	}

	public static String toLowerCaseMethod() {
		String text = "The sentence has only Lowercase Letters.";

		return text.toLowerCase();
	}

	public static String toUpperCaseMethod() {
		String text = "The sentence has only Uppercase Letters.";

		return text.toUpperCase();
	}

	public static int indexOfMethod() {
		String text = "Searching the first occurrence...";

		return text.indexOf('f');
	}

	public static int lastIndexMethod() {
		String text = "Searching the last occurrence...";

		return text.lastIndexOf('o');
	}
}
