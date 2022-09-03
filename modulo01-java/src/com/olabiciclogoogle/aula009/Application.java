package com.olabiciclogoogle.aula009;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Marlene
 * @date 05-05-2022
 * 
 * Modulo 1: Algoritmo e Estrutura de Dados 
 * Aula 009: Estrutura Linear - Pilha (Stack) e Fila (Queue)
 */

public class Application {

	public static void main(String[] args) {
		stacks();
		queues();
	}

	public static void stacks() {
		// Pilha (Stack)
		// LIFO -> (last-in-first-out)

		Stack<String> bookStack = new Stack<>();

		// Metodo push: adicionar elemento na pilha
		bookStack.push("Pollyanna");
		bookStack.push("A Menina Que Roubava Livros");
		bookStack.push("O Pequeno Principe");
		bookStack.push("Harry Potter");
		bookStack.push("Questão de Vida e Morte");
		bookStack.push("100 Anos de Solidão");

		// Metodo size: retorna o tamanho da pilha
		System.out.println(bookStack.size());

		// Metodo search: retorna o indice do elemento especifico de acordo com o topo
		// da pilha
		System.out.println(bookStack.search("O Pequeno Principe"));

		// Metodo peek: retorna o ultimo elemento inserido, o elemento do topo
		System.out.println(bookStack.peek());

		// Metodo isEmpty: retorna um booleano para verificar se a pilha esta vazia
		System.out.println(bookStack.isEmpty());

		// Metodo removeElementAt: remove o elemento pelo seu índice
		bookStack.removeElementAt(1);

		// Metodo removeAllElements: remove todos os elementos da pilha
		bookStack.removeAllElements();

		bookStack.push("Pollyanna");
		bookStack.push("A Menina Que Roubava Livros");
		bookStack.push("O Pequeno Principe");
		bookStack.push("Harry Potter");
		bookStack.push("Questão de Vida e Morte");
		bookStack.push("100 Anos de Solidão");

		// Metodo clear: remove todos os elementos da pilha
		bookStack.clear();

		bookStack.push("Pollyanna");
		bookStack.push("A Menina Que Roubava Livros");
		bookStack.push("O Pequeno Principe");
		bookStack.push("Harry Potter");
		bookStack.push("Questão de Vida e Morte");
		bookStack.push("100 Anos de Solidão");

		// Metodo lastElement: retorna o ultimo elemento inserido da pilha
		System.out.println(bookStack.lastElement());

		// Metodo firstElement: retorna o primeiro elemento inserido da pilha
		System.out.println(bookStack.firstElement());

		// Impressao da pilha em diferentes tipos de for
		for (int i = 0; i < bookStack.size(); i++)
			System.out.println(i);

		for (String stack : bookStack)
			System.out.println(stack);

		bookStack.forEach(stack -> {
			System.out.println(stack);
		});

	}

	public static void queues() {
		// Fila (Queue)
		// FIFO -> (first-in-first-out)

		// Implementacoes
		// Queue<String> nameQueue = new PriorityQueue<>(); //ordenados de forma
		// prioritária
		Queue<String> nameQueue = new LinkedList<>();
		// Queue<String> nameQueue = new Blocking Queue<>();

		// Metodo add: adiciona elemento na fila
		nameQueue.add("Jessica");
		nameQueue.add("Renata");
		nameQueue.add("Danilo");
		nameQueue.add("Diego");
		nameQueue.add("Larissa");
		nameQueue.add("Marlene");

		System.out.println(nameQueue);

		// Metodo peek: retorna o primeiro elemento inserido
		System.out.println(nameQueue.peek());

		// Metodo isEmpty: retorna um booleano para verificar se a pilha esta vazia
		System.out.println(nameQueue.isEmpty());

		// Metodo pool: retorna o elemento e o remove
		System.out.println("Removido: " + nameQueue.poll());

		// Metodo contains: retorna um booleano da existência do elemento
		System.out.println(nameQueue.contains("Diego"));
		System.out.println(nameQueue.contains("Diego ".trim()));

		// Metodo size: retorna o tamanho da pilha
		System.out.println(nameQueue.size());

		// Metodo clear: remove todos os elementos da pilha
		nameQueue.clear();
		System.out.println(nameQueue);

		// Impressao da pilha em diferentes tipos de for
		for (int i = 0; i < nameQueue.size(); i++)
			System.out.println(i);

		for (String queue : nameQueue) // funciona apenas em filas com tipos iguais
			System.out.println(queue);

		nameQueue.forEach(queue -> {
			System.out.println(queue);
		});

	}

}
