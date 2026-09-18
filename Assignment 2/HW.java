//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class HW {
    public static void main(String[] args) {

// Are you a REAL baker???
Scanner cookie = new Scanner(System.in);
int score = 0;
System.out.println("Question 1: How many grams of chocolate chips should go in chocolate chip cookies?");
int a1 = cookie.nextInt();
if (a1 == 170){
    System.out.println("Correct! You are a REAL baker!");
    System.out.println("You have earned 1 point for this question");
    score++;
} else if (a1 > 170){
        System.out.println("That is too many chocolate chips!");
        System.out.println("You have earned 0 points for this question :(");
    }
    else {
        System.out.println("That is not enough chocolate chips!");
        System.out.println("You have earned 0 points for this question :(");
    }
System.out.println("Question 2: How many minutes should you let cookies cool before eating them? ");
int a2 = cookie.nextInt();
if (a2 == 10){
    System.out.println("Correct! You are a REAL baker!");
    System.out.println("You have earned 1 point for this question");
    score++;
} else {
    System.out.println("That is not the right time!");
    System.out.println("You have earned 0 points for this question :(");
}

System.out.println("Question 3: What temperature (in degrees Fahrenheit) do you bake a box cake at?");
int a3 = cookie.nextInt();
if (a3 == 350){
    System.out.println("Correct! You are a REAL baker!");
    System.out.println("You have earned 1 point for this question");
    score++;
} else {
    System.out.println("That is not the right temperature!");
    System.out.println("You have earned 0 points for this question :(");
}

System.out.println("Your final score is: " + score + "/3");

    }
}
