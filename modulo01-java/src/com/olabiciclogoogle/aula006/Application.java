package com.olabiciclogoogle.aula006;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Marlene
 * @date 04-28-2022
 * 
 * M�dulo 1: Algoritmo e Estrutura de Dados 
 * Aula 006: ForEach em Java, LinkedList
 */

public class Application {

	public static void main(String[] args) {
		//forEach: implementado com apenas interfaces no Java
		
		List<String> names = new ArrayList<>(Arrays.asList("Jessica", "Renata"));
		names.forEach(name -> System.out.println(name));

		// LinkedList - estrutura de dados dinamica 
		LinkedList<String> products = new LinkedList<>();
		products.add("Google Docs");
		products.add("Google Sheet");
		products.add("Google Classroom");

		//remove o elemento do indice
		products.remove(1);
		
		//remove tudo
		products.removeAll(products);

		products.add("Google Docs");
		products.add("Google Sheet");
		products.add("Google Classroom");
		
		//remove o primeiro elemento
		products.removeFirst();
		
		//remove o ultimo elemento
		products.removeLast();
		
		products.add("Google Docs");
		products.add("Google Classroom");

		//adiciona os elementos de uma lista na outra
		products.addAll(names);
		
		//remove os elementos de uma lista na outra que foi inserida
		products.removeAll(names);
		
		for (int i = 0; i < products.size(); i++)
			System.out.println(products.get(i));
		

		for(String product : products)
			System.out.println(product);

	}

	
}
