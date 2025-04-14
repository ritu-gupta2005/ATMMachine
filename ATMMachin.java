package NewProject;
import  java.util.*;
class ATM{
    float Balance;
    int PIN=5433;

    public void chechpin() {
        System.out.println("Enter your pin");
        Scanner sc=new Scanner(System.in);
        int enterpin=sc.nextInt();
        if(enterpin==PIN) {
            menu();
        }else{
            System.out.println("Enter the valid Pin");
        }
    }

    public void menu(){
        System.out.println("Enter Your choice");
        System.out.println("1. Chack A/C Balance");
        System.out.println("2. withdrow Money");
        System.out.println("3. Dopsite");
        System.out.println("4. EXIT");

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();

        if(opt==1){
            CheckBal();
        } else if (opt==2) {
            withdrowBalance();
        } else if (opt==3) {
            dipositemomey();
        }
        else if(opt==4){
            return;
        }else{
            System.out.println("Enter a valid choose");
        }
    }
    public void CheckBal(){
        System.out.println("Balance "+ Balance);
        menu();
    }
    public void withdrowBalance(){
        System.out.println("Enter amount");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.printf("insufficient Balance");
        } else{
            Balance=Balance-amount;
            System.out.printf("Money withdrow successfully");
        }
    }
    public void dipositemomey(){
        System.out.println("Enter the amount");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money deposite");
        menu();
    }
}
public class ATMMachin {
    public static void main(String[] args) {
       ATM obj=new ATM();
       obj.chechpin();
    }
}
