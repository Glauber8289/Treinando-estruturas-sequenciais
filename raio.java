import java.util.Locale;
import java.util.Scanner;
public class raio {
	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double R, A, pi = 3.14159;
       
   System.out.println("digite um nummero para que seja calculado a area do circulo"); 
   R = sc.nextDouble();

    A = pi * R * R;
     
    System.out.printf("O Valor da area e A=%.4f%n", A);

	sc.close();
	
}
}
