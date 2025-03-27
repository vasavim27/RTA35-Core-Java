package controlstatements;

public class PrintNumUsingLoops {
    public static void main(String[] args) {
        PrintNumUsingLoops pn = new PrintNumUsingLoops();
        pn.forLoop();
pn.wLoop();
pn.dwLoop();

    }

    public void forLoop() {
        System.out.println("Executing for loop");
        for (int i = 1; i <= 10; i++) {

            System.out.println(i);
        }
    }

    public void wLoop() {
        int i = 1;
        System.out.println("Executing While loop");
        while (i <= 10) {

            System.out.println(i);
            i++;

        }
    }
    public void dwLoop() {
        int i = 1;
        System.out.println("Executing Do-While loop");
        do{

            System.out.println(i);
            i++;

        }while(i<=10);
    }




}

