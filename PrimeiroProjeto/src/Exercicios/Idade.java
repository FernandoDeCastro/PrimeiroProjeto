package Exercicios;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		int idadeEmDias;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		int idadeAtual = sc.nextInt();
		System.out.println("Digite o dia do seu Nascimento: ");
		int dia = sc.nextInt();
		System.out.println("Digite o mes do seu Nascimento: ");
		int mes = sc.nextInt();
		//System.out.println("Digite o ano do seu Nascimento: ");
		//int ano = sc.nextInt();
		System.out.println("Digite o mes atual: ");
		int mesAtual = sc.nextInt();
		System.out.println("Digite o dia de hoje: ");
		int hoje = sc.nextInt();
		
		
		int idadeParcial1 = (idadeAtual*365);
		int idadeParcial2 = (mesAtual - mes)*30;
		int idadeParcial3 = (hoje - dia);
		
		idadeEmDias = (idadeParcial1 + idadeParcial2 + idadeParcial3);
		
		System.out.println("A sua idade em dia e: " + idadeEmDias);
		
		
			
		
		
	}

}
