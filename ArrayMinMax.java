import java.util.Arrays;
import java.util.Scanner;

public class minMax {

    public static void minMaxOf4Digits(int[] arr, int n){
        int minCalc=0, maxCalc=0;
        Arrays.sort(arr);
        for(int i=0;i<4;i++){
            minCalc=minCalc+arr[i];
        }
        for(int j=0;j<4;j++){
            maxCalc=maxCalc+arr[n-1-j];
        }
        System.out.println("The minimum sum of  4 element:"+minCalc);
        System.out.println("The maxmum sum of  4 element:"+maxCalc);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of array element:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the array element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        minMaxOf4Digits(arr,n);
    }
}
