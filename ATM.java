package com.company;
import java.util.Scanner;
class setandget{
    int custmerid;
    int custmerpin;
    public int setcustmerid(int custid){
        this.custmerid=custid;
        return custid;
    }
    public void setcustmerpin(int custpin){
        this.custmerpin=custpin;
    }
    public int getCustmerid(){
        return custmerid;
    }
    public int getCustmerpin(){
        return custmerpin;
    }

}


public class ATM {


    public static void main (String[] args){
        setandget s=new setandget();

        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your login id: ");

        int id= sc.nextInt();
        s.setcustmerid(id);
        System.out.println("Please Enter your ATM PIN:");
        int pin=sc.nextInt();
        s.setcustmerpin(pin);

        System.out.println("Custmer ID is:"+s.getCustmerid());



        int balance=100000,withdraw=0,deposite=0,choice ,tacct=0,acctnum;
        while (true){
            System.out.println("\n");
            System.out.println("Welcome to our ATM machine");
            System.out.println("1.Transaction History");
            System.out.println("2. Withdraw ");
            System.out.println("3. Deposite");
            System.out.println("4. Check Balance");
            System.out.println("5.Transfer money");
            System.out.println("6. Quit");
            System.out.println("\n");
            System.out.println("Enter you choice: ");
            choice=sc.nextInt();

            if(choice==1||choice==2||choice==3||choice==4||choice==5||choice==6) {


                switch (choice) {

                    case 1:

                        System.out.println(" current Withdraw ammount is :" + withdraw);
                        System.out.println("current Deposited amount is : " + deposite);
                        System.out.println("current transfeered amount is: " + tacct);
                        System.out.println("Your Total balance is: " + balance);


                        break;
                    case 2:
                        System.out.println("Enter amount you want to withdraw: ");
                        withdraw = sc.nextInt();
                        if (balance > withdraw) {
                            balance = balance - withdraw;
                            System.out.println("Amount is withdrawed successfully");
                        } else {
                            System.out.println("Your balance is less");
                        }
                        break;
                    case 3:
                        System.out.println("Enter amount you want to deposite");
                        deposite = sc.nextInt();
                        balance = balance + deposite;
                        System.out.println("Amount is Deposited successfully");
                        break;

                    case 4:
                        System.out.println("Your balance is:" + balance);
                        break;

                    case 5:
                        System.out.println("Enter account number in which you have to transfer money:");
                        acctnum = sc.nextInt();
                        System.out.println("Enter amount : ");
                        tacct = sc.nextInt();
                        balance = balance - tacct;
                        System.out.println("Amount is transfered successfully");
                        break;

                    case 6:
                        System.exit(0);


                }
            }
           else {
               System.out.println("Please Enter appropriate choice");
               break;
           }


        }

    }
}
