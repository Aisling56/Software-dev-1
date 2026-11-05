public class person {
    String name;
    int age;

    public person(String n, int a){
        name = n;
        age = a;
    }

    void sayHi(){
        System.out.println(this.name + " says hi");
    }
}
