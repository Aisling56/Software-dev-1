public class HW4 {
    public static void main(String[]args){
    // Don't let the size of this scare you! no matter how big an array is, it all works the same!
    int[] myArray = {10, 3, 295, 38, 20, 3, 4, 267, 2445, 10, 5566, 87, 93, 17, 10, 2, 87, 267, 3176, 3, 82};
    // you cannot use the array util. Do this one by hand :(
    for (int i = 0; i < myArray.length; i++){
        

        for (int n = i + 1; n < myArray.length; n++){
            if (myArray[i] == myArray[n]){
                System.out.println(myArray[i]);
            }
        
        
        }
 
      }
//I learned that you can observe two different variables of the same array (i and n) in order to find matches within the array. 
// Using one of the variables to define the other variable allowed me to see if there were duplicates in my array, by looking at the variable next to variable "i". 
// i was also able to observe how a nested loop can explain why my output looked the way that it did
    
    
    }
}
