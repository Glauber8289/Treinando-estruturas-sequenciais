import java.util.Scanner;
public class DiferençaP {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,r;
	
    System.out.println("Digite um numero");
    a=sc.nextInt();
    System.out.println("Digite outro numero");
    b=sc.nextInt();
    System.out.println("Digite mais um numero");
    c=sc.nextInt();
    System.out.println("Digite outro numero");
    d=sc.nextInt();
    r=a*b-c*d;
    System.out.println("O valor da diferença e"+r);
    
		

	}

}
