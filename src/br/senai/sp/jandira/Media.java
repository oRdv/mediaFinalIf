package br.senai.sp.jandira;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Olá, bem vindo(a) ao nosso calclador de média final! Infome o seu nome: ");
		
		String nome;
		nome = teclado.next();
		
		System.out.print("Agora infome a nota do primeiro bimestre: ");
		double nota1 = teclado.nextDouble();
		
		System.out.print("Do segundo bimestre: ");
		double nota2 = teclado.nextDouble();
		
		System.out.print("Do terceiro bimestre: ");
		double nota3 = teclado.nextDouble();
		
		System.out.print("E por ultimo, do quarto bimestre: ");
		double nota4 = teclado.nextDouble();
		
		double result;
		result = nota1 + nota2 + nota3 + nota4;
		
		double notafim;
		notafim = result / 4;
		
		System.out.println("******************************");
		System.out.println("          MÉDIA FINAL         ");
		System.out.println("******************************");
		
	    System.out.println("Nome do aluno: " + nome);
		System.out.println("Nota do 1° bimestre: " + nota1);
		System.out.println("Nota do 2° bimestre: " + nota2);
		System.out.println("Nota do 3° bimestre: " + nota3);
		System.out.println("Nota do 4° bimestre: " + nota4);
		
		System.out.println("------------------------------");
		if(notafim >= 6) {
		System.out.println(nome + ", a sua nota final é " + notafim);
		System.out.println("PARÁBENS!! VOCÊ FOI APROVADO!!");
			
		} else {
			System.out.println("QUE PENA! VOCÊ FOI REPROVADO(A)");
		}
		
		System.out.println("------------------------------");
	}

}
