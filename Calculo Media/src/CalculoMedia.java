import java.util.Scanner;


public class CalculoMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1;
		double nota2;
		double media;
		final double FATOR = 0.5; //constante
		int idade;
		String nome;
		
		//Scanner
		Scanner leitor = new Scanner(System.in); //capturar informa��o do usario
		System.out.println("Ol� usu�rio, informe seu nome: ");
		nome = leitor.next(); //next() para ler o leitor
		System.out.println("Informe a sua idade: ");
		idade = leitor.nextInt(); // para ler o leitor
		System.out.println("Ola " + nome + " sua idade � " + idade);
		/*
		 * receber as duas notas via teclado
		 * calcular m�dia
		 * somar o fator a m�dia calculada
		 * exibir a m�dia final do usario
		 */
		System.out.println();
		System.out.println("Informe a primeira nota");
		nota1 = leitor.nextDouble();
		System.out.println("Informe a segunda nota");
		nota2 = leitor.nextDouble();
		media = ((nota1 + nota2)/2)+ FATOR;
				if(media >= 7)
					System.out.println("Aluno Aprovado, Media: " + media);
				else
					System.out.println("Aluno Reprovadoa, Media:" + media);
				
	}
	
	
}
			

