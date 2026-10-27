import java.util.Random;
public class App {
    public static void main(String[] args) {
        student student1 = new student("Jake", "senior", 3.9, 20165535);
        student student2 = new student("Mark", "junior", 3.6, 20167656);
        student student3 = new student("Allie", "sophomore", 3.4, 20176545);
        student student4 = new student("Brian", "freshman", 3.7, 20167644);
        student student5 = new student("Mary", "junior", 3.3, 20165555);

      student1.honorRoll();
      student2.honorRoll();
      student3.honorRoll();
      student4.honorRoll();
      student5.honorRoll();

      Random r = new Random();

      int chosenid = r.nextInt(100000000);

      student1.freeLunch(chosenid);
      student2.freeLunch(chosenid);
      student3.freeLunch(chosenid);
      student4.freeLunch(chosenid);
      student5.freeLunch(chosenid);

      /* I learned that you have to make sure all of your variables are 
      defined in student.java in order to use them in your methods and therefore use them in your main file. 
      I also learned that importing java.util.Random can be used to generate a randoms numnber given a maximum numnber.
      I was able to use this in my method on deciding who gets a free lunch. Since it was descibed that this happens randomly, 
      I knew I was going to need include somethhing that would generate a random integer. */


    

    }
}
