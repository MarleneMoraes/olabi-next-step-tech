package com.olabiciclogoogle.aula012;

/**
 * @author Marlene
 * @date 05-12-2022
 * 
 * Modulo 2: Programacao Orientada a Objetos 
 * Aula 012: Objetos
 */

public class Application {
	public static void main(String[] args) {
		Cachorro.fazerBarulho();
		
		//Instanciar uma classe 
		Pessoa pessoa = new Pessoa();
		pessoa.name = "Julio Cesar Brito da Silva";
		
		Pessoa aluno1 = new Pessoa();
		aluno1.name = "Larissa Botelho";
		
		Pessoa aluno2 = new Pessoa();
		aluno2.name = "Diego Simoes";
		
		
		//Inicializacao por referencia
		HomemAranha homemAranha1 = new HomemAranha();
		homemAranha1.name = "Tobey Maguire";
		
		HomemAranha homemAranha2 = new HomemAranha();
		homemAranha2.universe = 2;
		
		//Inicializacao pelo metodo construtor
		HomemAranha homemAranha3 = new HomemAranha(3, "Tom Holland");
	}
}


// Exemplo de Objetos em Java

class Cachorro {
	
	//Metodo: Comportamentos de um objeto
	public static void fazerBarulho() {
		System.out.println("Aul aul");
	}
		
}

class Pessoa {
	//Atributos
	String name;

	public Pessoa() { }
	
}


class Car {
	private String nameCar;

	//Metodos gets e sets - protecao dos atributos desta classe
	public String getNomeCarro() {
		return nameCar;
	}

	public void setNomeCarro(String nomeCarro) {
		this.nameCar = nomeCarro;
	}
	
}