import java.util.Scanner;
public class soma {

	public static void main(String[] args) {

				
				Scanner sc = new Scanner  (System.in);
				int x,y,soma;
				System.out.println("Digite um numero para soma");
				x =sc.nextInt();
				System.out.println("Digite outro numero para soma");
				y=sc.nextInt();
				soma=x+y;
				System.out.println("O resultado da soma é =" + soma);
				
		     sc.close();

	}

}
