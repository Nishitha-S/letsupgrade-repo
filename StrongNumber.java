import java.util.Scanner;

public class StrongNo {
    public static boolean sum(int number){
        int last=0;
        int result=0;
       int originalNumber=number;
        while(number>0){
        last=number%10;
        result=fact(last)+result;
        number=number/10;
        }
      // System.out.println(result);
    //System.out.println("The number is:"+number);
       if(result==originalNumber){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static int fact(int factnumber){
        int fact=1;
       for(int i=factnumber;i>=1;i--) 
       {
            fact=fact*i;
       }
       return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digit:");
        int digit = sc.nextInt();
        System.out.println(sum(digit));
    }
}
