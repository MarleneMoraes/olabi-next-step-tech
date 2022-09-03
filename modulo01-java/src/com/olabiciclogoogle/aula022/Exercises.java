package com.olabiciclogoogle.aula022;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * @author Marlene
 * @date 06-21-2022
 * 
 * Modulo 2: Programacao Orientada a Objetos 
 * Aula 022: Tabelas Hash
 */

public class Exercises {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ex001(scanner);
		//ex002();
	}
	
 /*
 * { Exercicio coletivo I
 *   Escrever um programa Java para testar se um mapa contém um mapeamento 
 *   para a chave especificada.
 */
	public static void ex001(Scanner s) {
		HashMap<String, String> nextsteppers = new HashMap<>();
		
		nextsteppers.put("Danilo", "Leo");
		nextsteppers.put("Diego", "Diogo");
		nextsteppers.put("Larissa", "Lucas");
		nextsteppers.put("Marlene", "Bruna");

		System.out.print("Digite a chave que deseja encontrar: ");
		String key = s.nextLine();

		boolean result = nextsteppers.containsKey(key);

		if (result == true)
			System.out.println("Next Stepper " + key + " foi encontrado(a).");
		else 
			System.out.println("Não foram encontrados Next Steppers com este nome.");
	
		
	}
	
 /*
 * { Exercicio coletivo II
 *   Escrever um programa Java para remover todos os mapeamentos 
 *   de um mapa.
 */
	
	public static void ex002() {
		HashMap<String, String> nextsteppers = new HashMap<>();

		nextsteppers.put("Danilo", "Leo");
		nextsteppers.put("Diego", "Diogo");
		nextsteppers.put("Larissa", "Lucas");
		nextsteppers.put("Marlene", "Bruna");
		
		nextsteppers.clear();
		
		System.out.println(nextsteppers);
	}
	
	/*
	 * { Exercicio coletivo III
	 *   (Hashtable) Uma empresa precisa de um programa de computador que efetue o 
	 *   cadastro de compradores: os compradores deverao ser alocados e recuperados 
	 *   rapidamente da memória.
	 *   Crie o programa para esta empresa, alocando os "Compradores" em uma hash table
	 *   - Utilizando a API do Java
	 *   - Use sua criatividade para escolher os componentes que serao utilizados para 
	 *   construir a hash table
	 *   - A chave hash devera ser composta pelo NOME;
	 *   - Cada comprador tem os seguintes dados: NOME, RG, CPF, Telefone. 
	 */
		
		public static void ex003(Scanner s) {
			Hashtable<String, Compradores> comprador = new Hashtable<>(); 
			
		}
}

class Compradores{
	private String nome;
	private String rg;
	private String cpf;
	private String telefone;
	
	public Compradores(String nome, String rg, String cpf, String telefone) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
