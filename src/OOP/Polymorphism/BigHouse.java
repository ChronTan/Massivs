package OOP.Polymorphism;

public class BigHouse {
    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.voice(3,"laika");
        dog=new BigDog();
        dog.voice(2,"Buran");
    }
}
