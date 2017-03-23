package impostobruto;

import java.util.Scanner;

public class ImpostoUnico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ir = 0;
		double sl;
		double de;
	
		Scanner leitor = new Scanner (System.in);
			System.out.println("Informe o salario");		
				sl = leitor.nextDouble();
			System.out.println("Informe os depedentes");
				de = leitor.nextDouble();
		
				
			if (sl>10.000 && sl<=30.000) {
					ir = ((sl-de*600)*0.5);
						System.out.println("Imposto de renda pagar R$" + ir);
			
			} else {			
			System.out.println(" ");
						
			if(sl>30.000 && sl<=60.000) {
				ir = ((sl-de*600)*0.5);
				System.out.println("Imposto de renda pagar R$" + ir);
				
			
			} else {
				System.out.println(" ");
				
				
			if(sl>60.000) {
			ir = ((sl-de*600)*0.5);
				System.out.println("Imposto de renda pagar R$" + ir);
				
				
		
			} else {
				System.out.println(" ");
						
}
			
			
			
}
			
			
			
		
			
}	
		
		
		
		
	}

}
