package com.olabiciclogoogle.aula015;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Marlene
 * @date 05-20-2022
 * 
 * Modulo 2: Programacao Orientada a Objetos 
 * Aula 015: Exercios de revisao
 */

public class Exercises {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
        ex001(scan);
        ex002(scan);
        ex003(scan);
        ex004(scan);
    }


    /*
     * { Exercicio coletivo I
     *   Escreva um programa que leia um valor real correspondente a uma medida
     *   em metros, convertendo o valor dado em pes (1 metro = 3.315 pes), exibindo
     *   o valor dado e convertido. Caso o usuario forneca um valor negativo, deve ser
     *   exibida uma mensagem e a operacao de conversao nao deve ser efetuada.
     */
    public static void ex001(Scanner scanner) {
    	Locale.setDefault(Locale.US);
 
    	System.out.println("CONVERSOR METROS-PÉS");
    	System.out.print("Valor (em metros): ");
    	double valorMetros = scanner.nextDouble();
    	
    	conversor(valorMetros);
    }
    
    private static void conversor(double valorMetros) {
    	if (valorMetros >= 0) {
    		System.out.printf("Valor (em metros): %.2f\n", valorMetros);
    		System.out.printf("Valor (em pés): %.2f\n",  valorMetros * 3.315);
    	} else {
    		System.out.println("A conversão não deve ser efetuada");
    	}
    	
    }
    
    /*
     * { Exercicio coletivo II
     *   Escreve um programa que leia dois numeros inteiros A e B quaisquer
     *   indicando se A e multiplo de B ou se B e multiplo de A.
     */
    public static void ex002(Scanner scanner) {
    	System.out.println("MÚLTIPLOS OU NÃO?");
    	int[] numeros = new int [2];
    	
    	for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número inteiro: ");
			numeros[i] = scanner.nextInt();
		}
    	
    	if(numeros[0]%numeros[1] == 0)
    		System.out.println("A é múltiplo de B");
    	else if(numeros[1]%numeros[0] == 0)
    		System.out.println("B é múltiplo de A");
    	else
    		System.out.println("Não há valores múltiplos");
    }
    
    
    /*
     * { Exercicio coletivo III
     *   Escreva um programa que leia 3 notas (valores reais), calculando e exibindo
     *   sua media aritmetica.
     *   Imprima tambem "Aprovado" se a media for maior que 7, "Reprovado" se for menor 
     *   que 3 e "Exame" se tiver entre 3 e 7.
     */
	public static void ex003(Scanner scanner) {
		Locale.setDefault(Locale.US);
		
		double[] notas = new double[3];
		double soma = 0.0;

		System.out.println("BOLETIM DO ALUNO");

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota do aluno: ");
			notas[i] = scanner.nextDouble();
			soma += notas[i];
		}
		
		double media = (soma / 3);
		System.out.printf("Média Final: %.2f\n", media);
		System.out.println(situacaoAluno(media));
		
	}

	private static String situacaoAluno(double media) {
		if (media >= 7.0)
			return "Aprovado";
		else if (media >= 3.0)
			return "Exame";
		else
			return "Reprovado";
	}
	
	
	 /*
     * { Exercicio coletivo IV
     *   Leia tres numeros inteiros fornecidos pelo usuário. Descubra qual deles é o maior de 
     *   todos,imprimindo o seu valor.
     *   
     */
	public static void ex004(Scanner scanner) {
        int[] numeros = new int[3];

        System.out.println("MAIOR VALOR");
        
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        if ((numeros[0] > numeros[1]) && (numeros[0] > numeros[2]))
            System.out.println("Maior valor: " + numeros[0]);
        else if ((numeros[1] > numeros[0]) && (numeros[1] > numeros[2]))
            System.out.println("Maior valor: " + numeros[1]);
        else
            System.out.println("Maior valor: " + numeros[2]);
    }
}
