import java.util.Scanner;

public class BedenKitle{
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen kilonuzu girin:");
        int kilo=scanner.nextInt();
        System.out.println("------------------------");
        System.out.println("Lütfen boyunuzu girin:");
        double boy=scanner.nextDouble();
        double bki=kilo/(boy * boy);
        System.out.println("------------------------");
        System.out.println("Vücut Kütle İndeksiniz:"+bki);

    }
}
