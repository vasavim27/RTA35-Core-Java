package assignments;

import java.util.Scanner;

public class FactorialNumber {
public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter a number");
    int n = scanner.nextInt();
    long factorial=1;
    for(int i=1;i<=n;i++){
        factorial*=i;
    }
    System.out.println("Factiorial of number "+n+" is"+factorial);
    scanner.close();
}
}
