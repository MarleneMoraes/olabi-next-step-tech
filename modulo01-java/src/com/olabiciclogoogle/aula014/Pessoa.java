package com.olabiciclogoogle.aula014;

public class Pessoa {
	//Atributos
	private String name;
	private String state;
	
	//Metodo construtor com parametros
	public Pessoa(String name, String state) {
		this.name = name;
		this.state = state;
	}

	//metodos de acesso aos atributos
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void falar() {
		System.out.println("Olá, eu sou uma pessoa");
	}
	
}
