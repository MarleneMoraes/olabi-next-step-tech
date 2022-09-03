package com.olabiciclogoogle.aula017.labs;

public class Ex001 {
	public static void main(String[] args) {
	
	}

}

/*
 * { Exercicio coletivo I 
 *   Identifique as classes e implemente um programa para a seguinte 
 *   especificacao: "O supermercado vende diferentes tipos de produtos.
 *   Cada produto tem um preco e uma quantidade em estoque. Um pedido de 
 *   um cliente e composto de itens, onde cada item especifico o produto 
 *   que o cliente deseja e a respectiva quantidade. Esse pedido pode ser 
 *   pago em dinheiro, cheque ou cartao;"
 */

class Product {
	private double price;
	private int qtd;

	public Product() { }
	
	public Product(double price, int qtd) {
		this.price = price;
		this.qtd = qtd;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
}

class Order {
	protected Product item;
	private String payment;

	public Order() { }

	public Order(Product item, String payment) {
		this.item = item;
		this.payment = payment;
	}

	public Product getItem() {
		return item;
	}

	public void setItem(Product item) {
		this.item = item;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
        this.payment = payment;
    }
}