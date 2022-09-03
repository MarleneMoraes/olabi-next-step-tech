package com.olabiciclogoogle.aula017.labs;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex003 {
	public static void main(String[] args) {
		Pessoa marlene = new Pessoa("Marlene", "11/10/1994", 1.58);

		System.out.println(marlene.toString());

		System.out.println("Idade: " + marlene.calcularIdade(marlene.getDataNascimento()));
	}

}

/*
 * { Exercicio coletivo III 
 *   Crie uma classe para representar uma pessoa com os atributos privados
 *   de nome, data de nascimento e altura. Crie os métodos para sets e gets 
 *   e um metodo para imprimir todos os dados de uma pessoa. Crie um metodo
 *   para imprimir a idade de uma pessoa.
 */

class Pessoa {
    private String nome;
    private String dataNascimento;
    private double altura;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + '\n' +
                "Data de Nascimento: " + this.dataNascimento +
                '\n' + "Altura: " + this.altura;
    }

    public int calcularIdade(String dataNascimento){
        GregorianCalendar dataAtual = new GregorianCalendar();
        int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
        int mesAtual = dataAtual.get(Calendar.MONTH) + 1;
        int anoAtual = dataAtual.get(Calendar.YEAR);

        int diaNascimento = Integer.valueOf(dataNascimento.substring(0,2));
        int mesNascimento = Integer.valueOf(dataNascimento.substring(3,5));
        int anoNascimento = Integer.valueOf(dataNascimento.substring(6,10));

        int idade;

        if (mesNascimento < mesAtual || mesNascimento == mesAtual
                        && diaNascimento <= diaAtual) idade = anoAtual - anoNascimento;
        else idade = (anoAtual - anoNascimento) - 1;

        return idade;
    }
}
