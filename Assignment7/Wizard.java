public class Wizard extends Enemy{
    String type;
    public Wizard(int h, int d, String t) {
        super(h, d);
        type = t;
    }
    void damageType(){
        if (this.type.equals("fire")){
            System.out.println("this wizard shoots a fireball");
        } else if (this.type.equals("ice")){
            System.out.println("this wizard shoots an iceball");
        } else {
            System.out.println("this wizards does not shoot fire or ice");
        }
        //if the type of wizard is 'fire', then print "this wizard shoots a fireball"
        //if the type is 'ice', then print "this wizard shoots an iceball"
    }
}
