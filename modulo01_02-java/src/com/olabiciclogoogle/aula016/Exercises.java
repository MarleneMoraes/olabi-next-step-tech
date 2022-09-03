package com.olabiciclogoogle.aula016;

import java.util.Scanner;

/**
 * @author Marlene
 * @date 05-31-2022
 * 
 * Modulo 2: Programacao Orientada a Objetos 
 * Aula 016: Exercios de revisao (II)
 */

public class Exercises {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
        ex001(scan);
        ex002(scan);
        ex003(scan);
        ex004(scan);
        ex005(scan);
    }


    /*
     * { Exercicio coletivo I
     *   Leia um numero qualquer fornecido pelo usuario. Determine se o numero 
     *   e maior do que 50, imprimindo uma mensagem indicando tal fato.
     */
    public static void ex001(Scanner scanner) {
    	 System.out.println("PROGRAMA MAIOR QUE 50");
         System.out.print("Digite um valor: ");
         int valor = scanner.nextInt();
         
         if (valor > 50) 
        	 System.out.println("Esse valor e maior que 50.");
    }
    
    /*
     * { Exercicio coletivo II
     *   Dado um numero qualquer, fornecido pelo usuario, descubra se o mesmo 
     *   e par ou impar.
     */
    public static void ex002(Scanner scanner) {
    	 System.out.println("PAR OU ÍMPAR?");
         System.out.print("Digite um número: ");
         int numero = scanner.nextInt();

         if (numero%2 ==0)
             System.out.println("PAR");
         else
             System.out.println("ÍMPAR");
    }  
    
    /*
     * { Exercicio coletivo III
     *   Crie uma variavel chamada "fruta". Essa variavel deve receber uma string
     *   com o nome de uma fruta. Apos, crie uma estrutura condicional switch que 
     *   receba essa variavel e que possua tres casos:
     *   - Caso maca: imprima na tela "Nao vendemos essa fruta aqui".
     *   - Caso kiwi: imprima na tela "Estamos com escassez de kiwis."
     *   - Caso melancia: imprima na tela "Aqui esta. Sao 3 reais o quilo".
     *   Teste com essas três opcoes e verifique. Crie tambem um default, que retornara
     *   uma mensagem de erro na tela
     */
	public static void ex003(Scanner scanner) {
		System.out.println("HORTIFRUTI");
        System.out.print("Digite uma fruta: ");

        String fruta = scanner.nextLine();
        
        switch(fruta) {
        case "maçã":
        	System.out.println("Nao vendemos essa fruta aqui.");
        	break;
        case "kiwi":
        	System.out.println("Estamos com escassez de kiwis.");
        	break;
        case "melancia":
        	System.out.println("Aqui está. São 3 reais o quilo");
        	break;
        default:
        	System.out.println("ERRO. Tente novamente.");
        		
        }
		
	}
	
	 /*
     * { Exercicio coletivo IV
     *   Elabore um algoritmo que some a idade de 5 pessoas utilizando while.
     *   
     */
	public static void ex004(Scanner scanner) {
		System.out.println("IDADE DAS PESSOAS");
		
		int[] idades = new int[5];
		int soma = 0;
		int i = 0;
		
		while(i < idades.length) {
			System.out.print("Idade da " + (i + 1) + "ª pessoa: ");
			idades[i] = scanner.nextInt();
			soma += idades[i];
			
			i++;
		}
		
		System.out.println("Soma: " + soma);
		
	}
	
	 /*
     * { Exercicio coletivo V
     *   Imprima a tabuada de um numero inserido pelo usuario.
     *   
     */
	public static void ex005(Scanner scanner) {
		System.out.println("TABUADA");
	
		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();
		
		System.out.println("Tabuada do " + numero);
		
		for(int i = 0; i <= 10; i++) 
			System.out.println(numero + " x " + i + " = " + (numero*i));
		
		
	}
}
