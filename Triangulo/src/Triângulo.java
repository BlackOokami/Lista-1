import java.util.Scanner;

public class Tri�ngulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double l1;
		double l2;
		double l3;
		
		
		//scanner
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o lado 1");//informa��o dos lados 
		l1 = leitor.nextDouble();
		System.out.println("Digite o lado 2");
		l2 = leitor.nextDouble();
		System.out.println("Digite o lado 3");
		l3 = leitor.nextDouble();
		//valida��o dos tri�ngulos
		if(l1==l2 && l2==l3){
		System.out.println("Esse triangulo � Equil�tero");
		
		}else if(l1==l2 || l1==l3 || l2==l3) 
			System.out.println("Esse triangulo � isoceles");
		
		else
			System.out.println("Esse triangulo � escaleno");
				
	}

}
