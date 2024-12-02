//import java.util.Scanner;
//
//interface account{
//
//    public void withdraw(int amount);
//    public void deposit(int amount);
//    public void checkBalance();
//}
//abstract class User_Bank_account implements account{
//    int currentbal=500;
//    @Override
//public void checkBalance()
//{
//    System.out.println("Current Balance is :"+currentbal+"\n");
//}
//}
//class ATM extends User_Bank_account{
//@Override
//    public void deposit(int amount){
//    this.currentbal=currentbal+amount;
//    System.out.println("Transaction Successful");
//    System.out.println("Credit amount is :"+amount);
// checkBalance();
//}
//
//@Override
//    public void withdraw(int amount)
//{
//    if(currentbal-amount<500)
//    {
//        System.out.println("Transaction Failed");
//        System.out.println("500 Rupees minimum balance should be maintained\n");
//
//        return;
//    }
//    this.currentbal=currentbal-amount;
//    System.out.println("Transaction Successful");
//    System.out.println("Credit amount is :"+amount);
//   checkBalance();
//}
//}
//public class pt_286_ATM_Machine {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//      ATM s=new ATM();
//        boolean run=true;
//        System.out.println("WELCOME TO ATM MACHINE");
//        while (run) {
//            System.out.println("1 for deposit\n2 for withdraw\n3 for check balance\nPRESS ANY OTHER KEY TO CANCEL THE TRANSACTION");
//            int n = sc.nextInt();
//            switch (n) {
//                case 1 -> {
//                    System.out.println("Enter the amount you want to deposit in your Bank Account");
//                 int amount= sc.nextInt();
//                    s.deposit(amount);
//                }
//                case 2 -> {
//                    System.out.println("Enter the amount you want to withdraw from your Bank Account");
//                    int amount= sc.nextInt();
//                    s.withdraw(amount);
//                }
//                case 3 -> s.checkBalance();
//                default -> {
//                    run=false;
//                    System.out.println("Transaction Cancelled");
//                }
//            }
//        }
//    }
//}
