package Exercicios;

import java.util.Scanner;

public class IdadeAlisson {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite sua idade.");
	    int idade = sc.nextInt();
	    System.out.println("Digite seu mês de nascimento.");
	    int mes = sc.nextInt();
	    System.out.println("Digite o mês de atual.");
	    int mesAtual = sc.nextInt();
	    System.out.println("Digite seu dia de nascimento.");
	    int dia = sc.nextInt();
	    System.out.println("Digite que dia é hoje.");
	    int diaAtual = sc.nextInt();

	    int idadeParcial = (idade*365);
	    int idadeParcial2 = ((mesAtual - mes)*30);
	    int idadeParcial3 = (diaAtual - dia);

	    int idadeEmDias = (idadeParcial + idadeParcial2 + idadeParcial3);


	    //int idade = sc.nextInt();
	    //idade = (idade*365);

	    System.out.println("Esse é o número em dias da sua idade: " + idadeEmDias);


	    sc.close();

	}

}
