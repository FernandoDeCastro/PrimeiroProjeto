package Exercicios;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		int numero1, numero2, numero3, resultado;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o o primeiro numero: ");
		numero1 = sc.nextInt();
		System.out.println("Digite o o segundo numero: ");
		numero2 = sc.nextInt();
		System.out.println("Digite o o terceiro numero: ");
		numero3 = sc.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O maior numero e o " + numero1);
		} else if (numero2 > numero1 ){
			System.out.println("O maior numero e o " + numero2);			
		} else {
			System.out.println("O maior numero e o " + numero3);
		}

	}

}
