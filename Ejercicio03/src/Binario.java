import java.util.Scanner;

public class Binario {


       public static void main(String[] args) {
    long Numero;
    long NumBinario = 0; 
    long residuo;
    int potencia = 0; 
    
    System.out.print("Introduce un numero: ");    
    
    Scanner sc = new Scanner(System.in);
    Numero = sc.nextInt();
    
    
    
    do {
		residuo = Numero % 2;
		Numero = Numero / 2;
		NumBinario  += residuo * (int)Math.pow(10, potencia);
		potencia++;
	}while(Numero>0);
	System.out.println(NumBinario);
}
}


