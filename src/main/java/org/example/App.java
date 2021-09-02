import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String Wiscon = "WI";

        System.out.println("What is the order amount?");
        double amount = input.nextDouble();
        System.out.println("What is the state?");
        String state = input.next();

        System.out.println("The subtotal is $" + amount);

        if (state.equals(Wiscon)) {

            double tax_total = (amount * .055);
            System.out.println("The tax is $" + tax_total);
            System.out.println("The total is $" + (tax_total+amount) );

        }
    }
}
