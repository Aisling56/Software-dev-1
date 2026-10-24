/*
Referencing your homework from https://github.com/melissachodziutko/CMPT-220/blob/main/Assignment%203/Debug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter your first number to be added");
    int firstInput = sc.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = sc.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();

    //#2 
    System.out.println("Enter a number and I will tell you the factorial: ");
    int num1 = sc.nextInt();
    System.out.println(factorial(num1));

    //#3
    System.out.println("Enter a number and I will tell you the sum of every other number: ");
    int num2 = sc.nextInt();
    System.out.println(SumOfEveryOther(num2));

    sc.nextLine();

    //#5
    System.out.println("Give me a word and I will return it to you in reverse");
    String word = sc.nextLine();
    System.out.println(reverse(word));

    }



  
    public static int add(int zyx, int tuv){


        return(zyx + tuv);


    }

  
    public static void printDog(){
        System.out.println("Dog");
    }

    public static int factorial(int num1){
        int factorial = 1;
        for (int i = 1; i <= num1; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int SumOfEveryOther(int num2){
        int sum = 0;

        for (int i = 1; i <= num2; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static String reverse(String word){
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--){
            reverse += word.charAt(i);
        }
        return reverse;
    }


}
