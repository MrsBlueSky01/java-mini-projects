import java.util.Random;
import java.util.Scanner;

public class MaksSayi
{
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.sayıyı girin:");
        int a=scanner.nextInt();
        System.out.println("2.sayıyı girin:");
        int b=scanner.nextInt();
        System.out.println("3.sayıyı girin:");
        int c=scanner.nextInt();
        int maks=-1;
        if (a >= b && a>=c ) {
            maks=a;
        }
        else if (b>= a && b>=c) {
            maks=b;
        }else{
            maks=c;
        }
        System.out.println("maks sayı:"+maks);
    }
}
