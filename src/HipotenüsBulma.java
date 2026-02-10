import java.util.Scanner;

public class HipotenüsBulma
{
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        int b;
        System.out.println("İlk kenar:");
        a= scanner.nextInt();
        System.out.println("ikinci kenar");
        b=scanner.nextInt();
        double h=Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs:"+h);

    }
}
