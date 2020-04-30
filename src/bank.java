import java.util.Scanner;

public class bank  {
    public Scanner sc = new Scanner(System.in);
    int current_cash =2000;
    int withdrawal,deposite;
    public void bank(){

    }
    void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    void sleep(int x){
        try{
            Thread.sleep(x);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    void check_funds(){
        clearScreen();
        System.out.println("Current Deposits: " +current_cash );

        function();
    }



    void withdraw(){
        System.out.println("How much money do you want to withdraw?");
        withdrawal = sc.nextInt();

        if(withdrawal >= current_cash){
            System.out.println("ERROR: you cannot withdraw money greater than your balance.");
            clearScreen();
            sleep(5000);

            function();
        }
        else{
            current_cash = current_cash - withdrawal;

            System.out.println("Withdrawn Successfully.");
            sleep(5000);

            check_funds();
        }

    }


    void Deposit(){
        System.out.println("How much money do you want to deposit?");
        deposite = sc.nextInt();

        current_cash = current_cash + deposite;
        System.out.println("Deposited Successfully.");
        check_funds();




    }




    void function(){
        System.out.println("=====================================================================");
        System.out.println("                              BANKING");
        System.out.println("=====================================================================");
        System.out.println("Current Deposits: " + current_cash);
        System.out.print("\n\n\n");


        System.out.println("Deposit (+)");
        System.out.println("Withdraw(-)");
        System.out.println("Balance");
        System.out.println("=====================================================================");




        String choice = sc.next();

        switch(choice){
            case "Balance":
                check_funds();
            case "+":
                Deposit();
            case "-":
                withdraw();
                break;

        }





    }





    public static void main(String args[]){
        bank cont = new bank();
        cont.function();

    }

}
