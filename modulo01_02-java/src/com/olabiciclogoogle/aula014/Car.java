package com.olabiciclogoogle.aula014;

public class Car {
	/*
	 * O mecanismo de aceleracao e inserido no carro ao ser construido,
	 * mas nao se ve nem pode-se modifica-lo, porque nao ha getter nem setter
	 * Ja outros o modelo pode ser visto, mas nao alterado
	 */
	private Double velocity;
	private String model;
	private String color;	
	private ThrottleMechanism throttleMechanism;
	
	public Car() { }

	public Car(String model, ThrottleMechanism throttleMechanism) {
		this.model = model;
		this.throttleMechanism = throttleMechanism;
		this.velocity = 0.00;
	}

	public Double getVelocity() {
		return velocity;
	}

	//Somente o proprio objeto e capaz de calcular a velocidade do mesmo 
	private void setVelocity(Double velocity) {
		this.velocity = velocity;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	//Metodo para ligar o farol
	public void turnOnLighthouse() {
		System.out.println("Ligando o farol");
	}
	
	
	
	
	
	
}
