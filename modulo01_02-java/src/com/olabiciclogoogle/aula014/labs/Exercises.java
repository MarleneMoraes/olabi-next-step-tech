package com.olabiciclogoogle.aula014.labs;

/*
 * { Exercicio coletivo I
 *   Crie uma classe Pessoa com os seguintes atributos:
 *   nome, estado e com o comportamento de falar
 */

class Pessoa {
    private String nome;
    private String estado;

    public Pessoa(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void falar(){
        System.out.println("Olá, meu nome é " + getNome());
    }
}


/*
 * { Exercicio coletivo II
 *   Crie uma classe Programador e uma classe UX Designer que seja do tipo Pessoa:
 *   - o metodo falar do programador deve imprimir na tela "Ola, eu sou programador"
 *   - o metodo falar do UX designer deve imprimir na tela "Ola, eu sou ux designer"
 */

class Programador extends Pessoa {

    public Programador(String nome, String estado) {
        super(nome, estado);
    }

    @Override
    public void falar(){
        System.out.println("Olá, meu nome é " + getNome() + "e sou uma pessoa programadora.");
    }
}

class Uxdesigner extends Pessoa {

    public Uxdesigner(String nome, String estado) {
        super(nome, estado);
    }

    @Override
    public void falar(){
        System.out.println("Olá, meu nome é " + getNome() + "e sou uma pessoa ux designer.");
    }
}