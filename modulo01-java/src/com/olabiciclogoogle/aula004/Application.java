package com.olabiciclogoogle.aula004;

/**
 * @author Marlene
 * @date 04-22-2022
 * 
 * Módulo 1: Algoritmo e Estrutura de Dados 
 * Aula 004: Manipulacao de strings - StringBuilder e String + Numbers
 */

public class Application {

	public static void main(String[] args) {
		/*
		 * StringBuilder: objeto responsavel pela imutabilidade do codigo, deixando mais
		 * leve e flexivel, pois a concatenacao e uma sobrescricao do codigo anterior
		 */
		stringBuilderObject();

		// Diferença de tempo entre concatenacao de strings e o StringBuilder
		System.out.println(timeBuilder());
		System.out.println(timeString());

		/*
		 * -----------------------------------------------------------------------------
		 * Exemplos de metodos para manipulacao de strings
		 */

		String originalString = "abcde FGHIJ ABC abc DEFG";

		// toLowerCase
		System.out.println(originalString.toLowerCase());

		// toUpperCase
		System.out.println(originalString.toUpperCase());

		// indexOf
		System.out.println(originalString.indexOf("bc"));

		// lastIndexOf
		System.out.println(originalString.lastIndexOf("bc"));

		// Metodo trim: retirar espacos em branco
		System.out.println(originalString.trim());

		// Substrings: criacao de uma nova string a partir do ponto indicado
		System.out.println(originalString.substring(2));
		System.out.println(originalString.substring(2, 9));

		// Metodo replace: substituir uma ou um conjunto de letras por outras
		System.out.println(originalString.replace("abc", "xy"));

		// compareTo: comparacao de ordem lexica (retorna um valor inteiro)
		compareTo();
				
		//Numbers: tipo byte, short, int, long, float, double
		numbers();
		
		// compareTo com numeros
		compareToNumbers();
	}

	public static void stringBuilderObject() {
		StringBuilder builderText = new StringBuilder();

		builderText.append("Hello ").append("world").append("!");

		System.out.println(builderText); // Hello world!
	}

	public static double timeBuilder() {
		long timeStart = System.nanoTime();

		StringBuilder builderText = new StringBuilder();

		for (int i = 0; i < 1000; i++)
			builderText.append(i);

		long timeEnd = System.nanoTime();

		return (timeEnd - timeStart);
	}

	public static double timeString() {
		long timeStart = System.nanoTime();

		String text = "";

		for (int i = 0; i < 1000; i++)
			text += i;

		long timeEnd = System.nanoTime();

		return (timeEnd - timeStart);
	}

	public static void compareTo() {
		String string1 = "Comparing strings";
		String string2 = "Comparing strings";
		String string3 = "comparing strings";
		String string4 = "Some string";

		System.out.println(string1 == string2);

		if (string1.equals(string2))
			System.out.println("Strings are the same.");

		if (string1.equals(string3))
			System.out.println("Strings are considered the same even with the difference in letters.");

		System.out.println(string1.compareTo(string2));
		System.out.println(string1.compareTo(string4));
		System.out.println(string4.compareTo(string1));
	}
	
	public static void numbers() {
		// Creating a Double Class obejct with value "45.13627"
		Double doubleVar = new Double("45.13627");

		// Converting this Double(Number) object to different primitive data tipes
		System.out.println(doubleVar.byteValue());
		System.out.println(doubleVar.shortValue());
		System.out.println(doubleVar.intValue());
		System.out.println(doubleVar.longValue());
		System.out.println(doubleVar.floatValue());
		System.out.println(doubleVar.doubleValue());
	}

	public static void compareToNumbers() {
		// Creating a Double Class obejct with value "12.55"

		Double doubleObj = 12.55;

		// Inicializing double variables
		double value1 = 8.66;
		double value2 = 12.55;
		double value3 = 15.98;

		System.out.println(doubleObj.compareTo(37.5)); // -1
		System.out.println(doubleObj.compareTo(value1)); // 1
		System.out.println(doubleObj.compareTo(value2)); // 0
		System.out.println(doubleObj.compareTo(value3)); // -1
	}
}
