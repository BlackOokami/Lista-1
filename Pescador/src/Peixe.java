import java.util.Scanner;


public class Peixe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double P;
		double E = 0;
		final double Multa = 4;
		Double Media;
		
		
		Scanner leitor = new Scanner (System.in);//capturar informa
		System.out.println("Ol� Jo�o!");
		System.out.println(" ");
		System.out.println("INFORME O PESO DOS PEIXES");
		P = leitor.nextDouble();    //Peso do peixe
			E = (P - 50)* Multa;    //calculo peso do peixe
			if(P >= 50)
			    System.out.println("A MULTA � PAGAR � DE: " + E); //informando se est� tudo ok 
			else
				System.out.println("O PESO EST� OK");
			
			
			  
		
		
		
		
	
	
	
		}	
	

}
