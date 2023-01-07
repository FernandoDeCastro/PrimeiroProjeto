package PecaIpi;

public class Resultado {

	public static void main(String[] args) {
		
		double valorTotal, Ipi = 5.00;
		
		valorTotal = (Peca1.valor * Peca1.quantidade + Peca2.valor * Peca2.quantidade)*(Ipi/100 + 1);
		
		System.out.println(valorTotal);
	}

}
