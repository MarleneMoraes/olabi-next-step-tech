package com.olabiciclogoogle.aula010;

/**
 * @author Marlene
 * @date 05-06-2022
 * 
 * Modulo 1: Algoritmo e Estrutura de Dados 
 * Aula 010: Estrutura Não Linear - Árvores
 */

public class Trees {
	// Arvore (Tree)
	// Representaçao dos dados de forma hierarquica
	Node root = null;
	int size = 0;

	// Metodo para insercao em busca binaria
	void insert(int value, Node place) {
		if (place == null)
			root = new Node(value);

		else if (value < place.value)
			if (place.left == null)
				place.left = new Node(value);
			else
				insert(value, place.left);

		else if (value > place.value)
			if (place.right == null)
				place.right = new Node(value);
			else
				insert(value, place.right);
	}

	void preOrder(Node place) {
		System.out.println(" " + place.value);

		if (place.left != null)
			preOrder(place.left);

		if (place.right != null)
			preOrder(place.right);
	}

}

class Node {
	int value;
	Node left;
	Node right;

	// Inicializador
	Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
}