package assignments;

public class EvenOrOddNumber {
    public static void main(String[] args)
    {
        EvenOrOddNumber n=new EvenOrOddNumber();
        n.evenOddMethod(12378);

    }
    public void evenOddMethod(int number){
        if(number%2==0) {
            System.out.println("Number is Even");
        }
            else{
                    System.out.println("Number is Odd");
                }
        }
    }

