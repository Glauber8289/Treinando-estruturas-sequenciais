import java.util.Locale;
import java.util.Scanner;

public class horas_trabalhadas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner (System.in);
		
		Double horast,valorRH,salarioR;
		
		System.out.println("Digite quantas horas voce trabalhou");
		horast=sc.nextDouble();
		System.out.println("Digite o valor que voce recebe por hora");
		valorRH=sc.nextDouble();
		salarioR=horast*valorRH;
		System.out.println("Seu salario no total e U$"+salarioR);
		

	}

}
