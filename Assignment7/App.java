public class App {
    public static void main(String[] args)  {

        

        //create a generic enemy and call its functions

        Enemy enemy1 = new Enemy(100, 12);
        enemy1.attack();


        //create a fire and an ice wizard and call all functions
        Wizard wizard1 = new Wizard(90, 10, "fire");
        wizard1.attack();
        wizard1.damageType();

        Wizard wizard2 = new Wizard(80, 8, "ice");
        wizard2.attack();
        wizard2.damageType();

        //create a goblin and call its functions
        Goblin goblin1 = new Goblin(70, 50);
        goblin1.attack();


    }
}
