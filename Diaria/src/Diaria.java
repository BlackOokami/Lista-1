import java.util.Scanner;

public class Diaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d;
		double td;
		double df = 0;
		final double DIARIA = 300;
		
		
		Scanner leitor = new Scanner (System.in);
			System.out.println("Digite a quantidade de dias que ficou aqui!");
				d = leitor.nextDouble();
						
				td = (d*DIARIA);
				System.out.println("Diaria é de: R$" + td);
				
				if(d<15){
					df = (td+20);
				System.out.println("A quantidade de diarias não excedeu 15 dias, valor: R$" + df);
				
				}else if(d==15) {
					df = (td+14);
				System.out.println("A quantidade de diarias é igual  15 dias, valor: R$ " + df);
				
	
				}else if(d>15){
					df = (td+12);
				System.out.println("A quantidade de diarias excedeu 15 dias, valor: R$ " + df);
				
	} else {

			System.out.println("Obrigado pela estadia! Volte sempre!");	
				
				

		
		
		
		
		
		
		
	}		
				
				
				
				
				
		
		
		
		
		
		{
				
				
				
	}			
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
