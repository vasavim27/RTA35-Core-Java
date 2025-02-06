package assignments;

import java.util.Scanner;

public class SumNaturalNumbers {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of natural numbers");
       int n=scanner.nextInt();
        int sum=0;
       for(int i=1;i<=n;i++)
       {

           sum+=i;

       }
        System.out.println("sum of first" + n+"natural numbers is"+ sum);
        scanner.close();
    }
}
