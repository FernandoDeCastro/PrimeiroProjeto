package Exercicios;

public class MediaAritmetica {

	public static void main(String[] args) {
		double media1, media2, mediaDasMedias;
		double numero1,numero2, numero3, numero4, numero5, numero6, soma;
		numero1 = 8;
		numero2 = 9;
		numero3 = 7;
		numero4 = 4;
		numero5 = 5;
		numero6 = 6;
				
		media1 = (numero1 + numero2 + numero3) / 3;
		media2 = (numero4 + numero5 + numero6) / 3;
		soma = media1 + media2;
		mediaDasMedias = (media1 + media2) / 2;
		System.out.println("A media 1 é: "+ media1);
		System.out.println("A media 2 é: " + media2);
		System.out.println("A soma das medias é: " + soma);
		System.out.println("A media das médias é: " + mediaDasMedias);
	}

}
