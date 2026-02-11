import java.util.Scanner;

public class Calculator
{
    static void main(String[] args) {
        int menu= 0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("1-Add");
        System.out.println("2-Sub");
        System.out.println("3-Multiply");
        System.out.println("4-Divide");
        System.out.println("5-Exit");
        System.out.println("-----------------");
        menu=scanner.nextInt();
        int a;
        int b;
        int result;
        switch (menu) {
            case 1:
                System.out.println("First number:");
                a=scanner.nextInt();
                System.out.println("Second number:");
                b=scanner.nextInt();
                System.out.println("Result: "+(a+b));
                break;
            case 2:
                System.out.println("First number:");
                a=scanner.nextInt();
                System.out.println("Second number:");
                b=scanner.nextInt();
                System.out.println("Result: "+(a-b));
                break;

            case 3:
                System.out.println("First number:");
                a=scanner.nextInt();
                System.out.println("Second number:");
                b=scanner.nextInt();
                System.out.println("Result: "+(a*b));
                break;

            case 4:
                System.out.println("First number:");
                a=scanner.nextInt();
                System.out.println("Second number:");
                b=scanner.nextInt();
                System.out.println("Result: "+(a/b));
                break;

            case 5:
                break;





        }

    }
}
