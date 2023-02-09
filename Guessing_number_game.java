package com.company;
import java.util.Scanner;
import java.util.Random;
public class Guessing_number_game {
    public static void guessing_number_game(){
        //Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int x=r.nextInt(101);
        int k=10;    //k for trials
        int i;
        System.out.println("\t\t\t\t\t***** WELCOME TO OUR GUESSING GAME *****");
        System.out.println("\t\t\t\t\t\t\tYou have only 10 Trials");
        System.out.println("\t\t\t\t\t\t\tAll the best!");
        System.out.println("\n\n");
        for(i=0;i<=k;i++){
            System.out.println("Enter the number you want to guess: ");
            Scanner sc=new Scanner(System.in);
            int guess=sc.nextInt();
            if(x==guess && k!=i){
                System.out.println("Congratulations!!");
                System.out.println("You gussed correct number");
                break;
            }
            else if(x>guess && k!=i){
                System.out.println("Please enter big number");
            }
            else if(x<guess && k!=i){
                System.out.println("Please enter small number");
            }

        }
        System.out.println("Trials are ended");
        System.out.println("The correct number is: "+x);





    }

    public static void main(String[] args) {
        //Driver code
        guessing_number_game();


    }
}
