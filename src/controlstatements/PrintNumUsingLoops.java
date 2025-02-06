package ControlStatements;

public class PrintNumUsingLoops {
    public static void main(String[] args) {
        PrintNumUsingLoops pn = new PrintNumUsingLoops();
        pn.forLoop();


    }

    ;

    public void forLoop() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public int wLoop() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;

        }
    }


}

