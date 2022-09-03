package com.olabiciclogoogle.aula012;

import java.util.Random;

/**
 * @author Marlene
 * @date 05-12-2022
 * 
 * Modulo 1: Algoritmo e Estrutura de Dados 
 * Aula 012: Estruturas Nao Lineares - Arvore Binaria e Grafos
 */

public class Application {
	public static void main(String[] args) {
		
		//Arvore com valores aleatorios
		Random random = new Random();
		Trees tree = new Trees();
		
		for(int i = 0; i < 10; i++)
			tree.insert(random.nextInt(100), tree.root);
		
		
		System.out.print("PreOrder: ");
		tree.preOrder(tree.root);
		
		System.out.println("\nInOrder: ");
		tree.inOrder(tree.root);
		
		System.out.println("\nPosOrder: ");
		tree.posOrder(tree.root);
		
	}
}


