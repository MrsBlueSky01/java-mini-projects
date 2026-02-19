import java.util.Scanner;

public class AtmProgram
{
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int balance=1000;
        String islemler="1-Check Balance\n"
                +"2-Withdrawl\n"
                +"3-Deposit\n"
                +"Q for Quit\n";

        System.out.println("------------------");
        System.out.println(islemler);
        System.out.println("-------------------");
        while (true){
            System.out.println("Select one operation:");
            String operation=scanner.nextLine();
            if(operation.equals("q")){
                System.out.println("Exits...");
                break;
            }else if (operation.equals("1")){
                System.out.println("Balance: "+balance);

            } else if (operation.equals("2")) {
                System.out.println("Amount to withdraw:");
                int amount=scanner.nextInt();
                scanner.nextLine();
                if(balance-amount<0){
                    System.out.println("Your balance is not enough!");
                }
                else {
                    balance-=amount;
                    System.out.println("your new balance:"+balance);
                }


            } else if (operation.equals("3")) {
                System.out.println("Amount to Deposit:");
                int amount=scanner.nextInt();
                scanner.nextLine();
                    balance+=amount;
                    System.out.println("your new balance:"+balance);



            }
        }
    }

}
