public class multiplicationTable {

    public static void multiplyTable(int number){
        if(number>0){
            for(int i=1;i<=10;i++){
                int result=number*i;
                System.out.println(number+"*"+i+"="+result);
            }
         }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number to known the multiplication table:");
        int tableNo=sc.nextInt();
        multiplyTable(tableNo);

    }
}
