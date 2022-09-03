package com.olabiciclogoogle.aula009;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exercises {
	public static void main(String[] args) {
		
		exercicioI();
		
		exercicioII();
		
		exercicioIII();
	}

	public static void exercicioI() {
		/*
		 * { Exercicio coletivo I
		 *   Escreva um programa para unir duas listas vinculadas
		 */

		LinkedList<String> teachers = new LinkedList<>();
		LinkedList<String> interns = new LinkedList<>();
		
		teachers.add("Jessica");
		teachers.add("Renata");
		
		interns.add("Danilo");
		interns.add("Diego");
		interns.add("Larissa");
		interns.add("Marlene");
		
		LinkedList<String> names = new LinkedList<>();
		names.addAll(teachers);
		names.addAll(interns);
		
		System.out.println(names);
	}

	public static void exercicioII() {
		/*
		 * { Exercicio coletivo II
		 *   Escreva um programa para remover e retornar o primeiro elemento de 
		 *   uma lista vinculada
		 */
		
		LinkedList<String> interns = new LinkedList<>();
		
		interns.add("Jessica");
		
		interns.add("Danilo");
		interns.add("Diego");
		interns.add("Larissa");
		interns.add("Marlene");
		
		interns.removeFirst();
	
		System.out.println(interns);
	}

	public static void exercicioIII() {
		/*
		 * { Exercicio coletivo III
		 * 	 Implemente uma fila usando pilhas, ou seja: enfilere adicionando um elemento 
		 * 	 ao final da fila e desenfilere removendo um elemento do início da fila, de 
		 * 	 forma a utilizar as funções padrão da estrutura de dados da pilha. 
		 */

		Queue<Integer> ages = new LinkedList<>();
		
		ages.add(21);
		ages.add(25);
		ages.add(27);
		ages.add(29);
		
		int sizeQueue = ages.size();
		
		Stack<Integer> ageStack = new Stack<Integer>();
		
		for(int i = 0; i < sizeQueue; i++) {
			int removeElement = ages.poll();
			ageStack.push(removeElement);
		}
		
		for(int i = 0; i < sizeQueue; i++) {
			int element = ageStack.pop();
			ages.add(element);
		}

		System.out.println(ages);

	}
}

