package Exercicios;

public class Saldo {

	public static void main(String[] args) {
		double saldo = 1000;
		double reajuste = saldo * 0.01;
		double saldoReajustado = saldo + reajuste;
		
		System.out.println("O valor do reajuste é de: " + reajuste);
		System.out.println("O valor do novo saldo é de: " + saldoReajustado);
	}

}
