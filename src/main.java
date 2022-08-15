import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        int n1,n2,decision;

        System.out.println("Please enter the first number : ");
        n1 = inp.nextInt();
        System.out.println("Please enter the second number : ");
        n2 = inp.nextInt();

        System.out.println("1-Sum\n2-Extraction\n3-Multiplication\n4-Divide");
        System.out.print("Your Decision: ");
        decision = inp.nextInt();

        switch (decision){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3 :
                System.out.println(n1*n2);
                break;
            case 4 :
                System.out.println(n1/n2);
                break;
        }
    }
}
