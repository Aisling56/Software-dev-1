/*
Remember that stacks/queues/linkedlists all work super similarly to arraylists, so i bet you $10 you could reference earlier HW if you get stuck....

1. Take the stack I created and find the maximum and minimum value
2. Find out how many elements were in the stack

3. Find the middle value of the linkedlist I created

4. Implement a real life example of any of the structures and do at least 3 operations to it
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stax = new Stack<>();
        
        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);

        //#1: 
        stax.pop();
        stax.pop();
        stax.pop();
        System.out.println("The min value is " + stax.peek());
        stax.pop();
        stax.pop();
        System.out.println("The max value is " + stax.peek());

        //#2: 

        stax.push(386);
        stax.push(492);
        stax.push(563);
        stax.push(28);
        stax.push(61);
        System.out.println("There were " + stax.size() + " elements in the stack");


        
        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);


        //#3: 
        linky.remove();
        linky.remove();
        System.out.println("The middle value of the linkedlist is " + linky.getFirst());
      


        //#4: 
        Queue<String>iphoneLine = new LinkedList<>();
        iphoneLine.add("1st in line for the new iphone");
        System.out.println(iphoneLine.element());
        iphoneLine.remove();
        iphoneLine.add("I was second in line for the new iphone, but now I am first!");
        System.out.println(iphoneLine.element());



    }
}
