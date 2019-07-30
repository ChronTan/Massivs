package Classes;

public class House {

    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat(3,"myrka");

        dog.voice(3,"Reks");
        cat.voice();
    }
}
