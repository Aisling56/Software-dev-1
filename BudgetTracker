import java.util.Scanner;
public class BudgetTracker {

    public static void main(String[] args) {
        double currentBalance = 100.00;
        // i am starting with $100.00 in the account. i used doubles for all of this code instead of integers because I am accounting for prices like $13.50. 
        boolean trackBalance = true;
        // this variable is created so that once the user runs out of funds, their budget will no longer be tracked.
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's track your budget. Your starting balance is: $" + currentBalance);


        while (trackBalance){
            System.out.println("Enter the cost of the item you want to purchase in US dollars:");
            double itemCost = sc.nextDouble();

            currentBalance = fundsEvaluator(currentBalance, itemCost);
            System.out.println("Your current balance is: $" + currentBalance);

            if (currentBalance <= 0){
                System.out.println("You have no funds left. Replenish your balance to continue tracking your budget.");
                trackBalance = false;
            //once the user reaches a balance of $0, their budget no longer gets tracked and it exits the while loop.
            }
        }
    }
     
    public static double fundsEvaluator(double balance, double price){
        // this method is going to determine whether or not the user can afford the item they want to purchase. It will also give the new balance in their account and/or warn them their funds are getting low.  
        if (price > balance){
            System.out.println("Purchase declined, you do not have sufficient funds");
            return balance;
            //using return statements in each condition, so the new baalance gets put back into the program and applies that information to future inputs
        }
        else if ((balance-price) < 25 && (balance-price) > 0){
        // both of these condtions must be true for the statement to print. after purchasing an item, if their balance is between $0 and $25, they get a warning. 
        double newBalance = balance - price;
        System.out.println("Purchase approved, but your balance is low.");
        return newBalance;
        }

        else {
            double newBalance = balance - price;
            System.out.println("Purchase approved");
            return newBalance;
        }
    
    }

}
