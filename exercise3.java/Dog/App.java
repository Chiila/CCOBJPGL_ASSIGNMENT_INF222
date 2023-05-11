package Dog;

public class App {
    public static void main(String[] args) throws Exception {

        Bullshit myPet = new Bullshit();

        myPet.bark();
        System.out.println(myPet.name);
        System.out.println(myPet.age + " Years old.");
    }
}