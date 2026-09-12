import java.util.Scanner;
public class Aisling {
    public static void main(String[] args){
// 1. Define a scanner with the name "sc": 
    Scanner sc = new Scanner(System.in);
// defining a scanner follows this format, but "sc" can be replaced with any name.

// 2. Use the "System.out.println("How old are you?";" statement to ask the user, then prompt the user for age and then print it back to them by creating a string variable for age

    //finish this one for me by receiving and printing the user's age back to them
    System.out.println("How old are you?");
    int yourAge = sc.nextInt();
    String age = "You are " + yourAge + " years old"; 
    System.out.println(age);
//since yourAge is a number, I used int for my input variable. Then I used string for my age variable since it included words and then I printed it out. 

// 3. Add integers num1 and num2 together printing the sum, and comment at the end with //"What I learned" and a sentence or two.  
        //can you do some math for me? take these variables and print out the sum of them!
       int num1 = 10;
       int num2 = 37;
       int sum = num1 + num2;
       System.out.println(sum);
       //I learned that whenever you are creating a variable you have to put what type of variable it is in front (naming it to be a String, Integer, etc.). I also learned that you must put semicolons after each line of code. 
    
    sc.close();
    }

}
