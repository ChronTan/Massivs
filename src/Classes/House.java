package Classes;

public class House {

    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat(3,"myrka");
        Cat cat1=new Cat(2,"barsik");

        dog.voice(3,"Reks");
        cat.voice();
        cat1.voice();
    }
}
