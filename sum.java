import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		int num1,num2,num3,num4,num5;
		Scanner sc =  new Scanner(System.in);
		System.out.print("enter the number:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		num4=sc.nextInt();
		num5=sc.nextInt();
		int sum=num1+num2+num3+num4+num5;
		System.out.println("Sum of the numbers:"+sum);
	}

}
                          
