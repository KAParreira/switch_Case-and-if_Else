package exercices;
import java.util.Scanner; 
public class Agiota {
  public static void main (String [] args) {
	Scanner digite = new Scanner (System.in);  
	  double valorP, diasA, valorAtual;
	  
	  System.out.println("Digite o valor da prest�ao");
	  valorP = digite.nextDouble();
	  System.out.println("Digite a quantidade de dias em atraso");
	   diasA = digite.nextDouble();
	 
	   if(diasA <= 45) {
         valorAtual  = valorP+(valorP*0.02)+(valorP*0.0001*diasA);   
	    System.out.println("Esse � o valor atual da presta��o " + valorAtual);
	    }   else {
	      valorAtual = valorP+(valorP*0.05)+(valorP*0.0001*diasA);	
	     System.out.println("Esse � o valor atual da presta��o " + valorAtual);
	     } digite.close(); 	
  }
}
