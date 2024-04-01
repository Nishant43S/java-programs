import java.util.Scanner;

public class BankAccount{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account acc = new Account();


        while (true) {
            System.out.println("");
            System.out.println("--------Menu--------");
            System.out.println("1> Enter Account Details");
            System.out.println("2> add amount");
            System.out.println("3> withdraw amount");
            System.out.println("4> account info");
            System.out.println("5> account balance info");
            System.out.println("6> Exit");

            System.out.println();
            System.out.print("Enter Choice:: ");
            int choice = scan.nextInt();

            if(choice == 1){
                acc.AddDetails();           
            }

            else if(choice == 2){
                System.out.println("");
                System.out.print("Add amount to account: ");
                long addamt = scan.nextLong();
                acc.Deposite(addamt);

                if(addamt < 0){
                    System.out.println("invalid amount");
                }else{
                    System.out.println("Amount "+addamt+" Deposited");
                    System.out.print("Your account balance: ");
                    acc.showbalance();
                    System.out.println("");
                }
            }

            else if(choice == 3){
                System.out.print("withdraw amount: ");
                long withdrawamt = scan.nextLong();
                acc.Withdrawl(withdrawamt);


                if (withdrawamt <= acc.amount){
                    System.out.println("Ammount "+withdrawamt+" Withraw");
                }else{
                    System.out.println("Withrawl fail");
                }
            }

            else if(choice == 4){

                System.out.println("");
                System.out.println("-------Account Information-------");
                acc.ShowInfo();
                System.out.println("");
            }

            else if(choice == 5){
                System.out.println("your balance is");
                acc.showbalance();
            }


            else if(choice == 6){
                System.out.print("Press 0 to exit press 1 to continue\n");
                int ConfirmExit = scan.nextInt();
                if(ConfirmExit == 0){
                    System.out.println("Exited...");
                    break;
                }else{
                    continue;
                }

            }

        }

    }

    
}

class Account{
    String Username;
    String AccountNumber;
    long amount;

    Scanner sca = new Scanner(System.in);

    public void AddDetails(){
        System.out.print("User Name: ");
        this.Username = sca.nextLine();

        System.out.print("Account Number: ");
        this.AccountNumber = sca.nextLine();

        System.out.print("Enter Amount: ");
        this.amount = sca.nextInt();
    }

 

    public boolean Withdrawl(long amt){
        if(amt > amount){
            System.out.println("your balance is: "+amount);
            System.out.println("you can not withdrawl");
            return false;
        }else{
            amount = amount - amt;
            System.out.println("Amount Withdraw: "+amt);
            return true;
        }
    }

    public boolean Deposite(long amt){
        if(amt < 0){
            return false;
        }else{
            amount = amount + amt;
            System.out.println("Amount deposited: "+amt);
            return true;
        }
    }

    public void ShowInfo(){
        System.out.println("Account Holder Name: "+Username);
        System.out.println("Account Number: "+AccountNumber);
        System.out.println("Account Balance: "+amount);
    }

    public void showbalance(){
        System.out.println("Account Balance: "+amount);   
    }
}