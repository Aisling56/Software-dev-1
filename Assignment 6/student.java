public class student {
    String name;
    String year;
    double gpa;
    int id; 

    public student(String n, String y, double g, int i){
        name = n;
        year = y; 
        gpa = g;
        id = i;
    }
    
    void honorRoll(){
        if (this.gpa > 3.6){
            System.out.println(this.name + " is an honor roll student");
        } else {
            System.out.println(this.name + " is not an honor roll student");
        }
    }

    void freeLunch(int chosenid){
        if (this.id == chosenid){
            System.out.println(this.name + " wins free lunch today!");
        } else {
            System.out.println("No free lunch for " + this.name + " today");
        }
    }
}
