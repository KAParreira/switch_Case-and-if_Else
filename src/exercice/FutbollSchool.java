package exercice;
import java.util.Scanner;
public class FutbollSchool {
 public static void main (String  [] args){
	 Scanner digite = new Scanner (System.in);
  int idade;
 
  System.out.println("Digite a idade do aluno");
  idade = digite.nextInt();
  
  switch (idade) {
  case 6:
	  System.out.println("Categoria dente de leite");
	  break;
  case 7:
	  System.out.println("Categoria júnior");
      break;
  case 8:
	  System.out.println("Categoria júnior max");
	  break;
  case 9:
	  System.out.println("Categoria júnior master");
	  break;
  case 10:	  
	  System.out.println("Categoria master");
	  break;
  default:
	  System.out.println("idade inválida");
	  digite.close();
  } 
 }
}
