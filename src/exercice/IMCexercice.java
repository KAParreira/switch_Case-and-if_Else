package exercice;
import java.util.Scanner;
public class IMCexercice {
 public static void main(String [] args) {
	Scanner digite = new Scanner (System.in);  
  double peso, altura, imc ;
  
  System.out.println("Informe o peso");
  peso = digite.nextDouble();
  System.out.println("Informe a altura");
  altura = digite.nextDouble();
  imc = peso/(altura*altura);
  System.out.printf("Seu IMC é %.1f", imc);
 
  if (imc<17) {
	   System.out.println(" Muito abixo do peso");
  } else if (imc <=18.49) {	
	   System.out.println(" Abaixo do peso");
      }  else if (imc <=24.99) {
          System.out.println(" Peso normal ");
          } else if (imc <=29.99)  {      
             System.out.println(" Acima do peso ");
             } else if (imc <=34.99) {
               System.out.println(" Obesidade I ");	
                } else if (imc <=39.99) {
                  System.out.println(" Obesidade II (severa) ");   
                  } else {
                   System.out.println(" Obesidade III (mórbida) ");    
                   }   digite.close();
 
 }
}
