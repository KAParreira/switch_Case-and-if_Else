package exercice;
import java.util.Scanner;
public class Rodizio {
public static void main (String [] args) {
 	Scanner leia = new Scanner (System.in);
	int placa; 
	
	System.out.println("informe o final placa do carro");
	placa = leia.nextInt();
	
	switch (placa) {
     case 1:
     case 2:
	  System.out.println("Não pode circular na Segunda-Feira");
	  break;
     case 3:
     case 4: 
	  System.out.println("Não pode circular na Terça-Feira");
	  break;
     case 5:
     case 6:
	   System.out.println("Não pode circular na Quarta-Feira");
	   break; 
     case 7:
     case 8:
	   System.out.println("Não pode circular na Quinta-Feira");
       break;    
     case 9:  
     case 0:
	   System.out.println("Não pode circular na Sexta-Feira"); 
	   break;
	 default:
	   System.out.println("Numéro inválido");
	  leia.close();
	}	
  }
}
