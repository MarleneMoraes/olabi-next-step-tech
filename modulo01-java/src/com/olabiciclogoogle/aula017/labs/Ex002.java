package com.olabiciclogoogle.aula017.labs;

import java.util.List;

public class Ex002 {
	public static void main(String[] args) {
		
	}

}

/*
 * { Exercicio coletivo II 
 *   Faça um programa de agenda telefônica, com as classes Agenda e Contato.
 */

class TelephoneList {
	private List <Contact> contact;

	public TelephoneList() { }

}

class Contact {
    private String name;
    private String lastName;
    private String telephone;
    private String cellphone;

    public Contact(String nome, String celular) {
        this.name = nome;
        this.cellphone = celular;
    }

    public Contact(String nome, String sobrenome, String telefone, String celular) {
        this.name = nome;
        this.lastName = sobrenome;
        this.telephone = telefone;
        this.cellphone = celular;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getSobrenome() {
        return lastName;
    }

    public void setSobrenome(String sobrenome) {
        this.lastName = sobrenome;
    }

    public String getTelefone() {
        return telephone;
    }

    public void setTelefone(String telefone) {
        this.telephone = telefone;
    }

    public String getCelular() {
        return cellphone;
    }

    public void setCelular(String celular) {
        this.cellphone = celular;
    }
}

