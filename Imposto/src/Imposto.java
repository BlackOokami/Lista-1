import java.util.Scanner;

public class Imposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ir;
		double rc;
		double rh;
		double rm;
		double sl;
		final double INSS = 0.8;
				
		
		Scanner leitor = new Scanner (System.in);
			System.out.println("Informe a renda do Homem");		
				rh = leitor.nextDouble();
			System.out.println("Informe a renda da Mulher");
				rm = leitor.nextDouble();
			rc = (rh + rm);
			System.out.println("A renda conjunta é: " + rc);
				
			if (rc>=900 && rc<1500) {
				ir = (rc*0.10);
				sl = (ir*INSS);
				System.out.println("O imposto de renda é de: " + ir + ", A aliquota é de 10% e a renda liquida é de: " + sl);
				
				}else if(rc>=1500 && rc<2500){
					ir = (rc*0.15);
					sl = (ir*INSS);
					System.out.println("O imposto de renda é de: " + ir + ", A aliquota é de 15% e a renda liquida é de: " + sl);
				
				}else if(rc>=2500){
					ir = (rc*0.20);
					sl = (ir*INSS);
					System.out.println("O imposto de renda é de: " + ir + ", A aliquota é de 20% e a renda liquida é de: " + sl);
	
				
					} else {	
	
	
	
}

			
			
			
	}		
}
