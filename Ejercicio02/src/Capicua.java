import java.util.Scanner;

public class Capicua {

	
	 public static void main(String[] args) {
	        long Numero;
	        long auxiliar; 
	        double inverso = 0;
	        double cifra;
	        
	        
	        System.out.print("Introduce un numero: ");    
	        
	        Scanner sc = new Scanner(System.in);
	        Numero = sc.nextInt();
	        
	        
	        
	        auxiliar = Numero;
	        while (auxiliar!=0){
	            cifra = auxiliar % 10;
	            inverso = inverso * 10 + cifra;
	            auxiliar = auxiliar / 10;
	        }
	    
	        if(Numero == inverso){
	            System.out.println("Es capicua");
	        }else{
	            System.out.println("No es capicua");
	        }
	    }
	 
}

