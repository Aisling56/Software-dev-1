/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Let's calculate a necessary tip for your meal. Enter the cost of your bill in US dollars:");
        double mealCost = sc.nextDouble();

        System.out.println("Enter the percentage you would like to tip (ex: 15, 18, 20, etc.):");
        double tipPercentage = sc.nextDouble();


        calculateTip(mealCost, tipPercentage);


    }


    public static double calculateTip(double mealCost, double tipPercentage){
        double tip = mealCost * (tipPercentage / 100);
        double total = mealCost + tip;

        System.out.println("Your tip amount is: $" + tip);
        System.out.println("Your total bill including tip is: $" + total);

        return total;

    }
   
}
