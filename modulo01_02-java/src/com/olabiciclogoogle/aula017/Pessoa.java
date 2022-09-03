package com.olabiciclogoogle.aula017;

/**
 * @author Marlene
 * @date 06-02-2022
 * 
 * Modulo 2: Programacao Orientada a Objetos 
 * Aula 017: Orientacao a objetos (classes, objetos, atributos, construtores, metodos) e seus pilares
 */

public class Pessoa {
	// Atributos
	private String cpf;
	private String nome;
	private int idade;
	private String endereco;
	private String telefone;
	private double salario;

	// Metodos

	// metodos construtores: constroi o objeto da classe pessoa
	public Pessoa() {
		super(); // chama o metodo construtor da classe pai (no caso, a classe Object)
	}

	// Polimorfismo: mesma assinatura, mas comportamentos diferentes
	public Pessoa(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}

	public Pessoa(String cpf, String nome, int idade) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}

	public Pessoa(String cpf, String nome, double salario) {
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Encapsulamento: protecao dos atributos para uso apenas da classe (private)
	

}
