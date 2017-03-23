import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pa;
		double vm;
		double np = 0;
		
		
		Scanner leitor = new Scanner (System.in);
			System.out.println("Digite o preço atual do produto");
			pa = leitor.nextDouble();
			System.out.println("Informe a venda mensal media");
			vm = leitor.nextDouble();
			
			if(pa<30 && vm<500){
				np = (pa*1.10);
			System.out.println("Novo preço é de: " + np + " ,reajuste sofrido de 10%");
			
			}else if(pa>=30 && vm>=500 && pa<60 && vm<1200 ){
				np = (pa*1.50);
			System.out.println("Novo preço é de: " + np + " ,reajuste sofrido de 15%");
			
			}else if(pa>=80 && vm>=1200){
				np = (pa/2);
			System.out.println("Novo preço é de: " + np + " ,reajuste sofrido de 20%");
			
			
			}else {
			
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
