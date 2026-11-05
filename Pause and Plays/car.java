public class car {
    String make;
    int year;

    public car(String m, int y){
        make = m;
        year = y;
    }

    void isClassic(){
        if (this.year <= 2001){
            System.out.println("This is a classic car.");
        } else {
            System.out.println("This is not a classic car.");
        }
    }

}
