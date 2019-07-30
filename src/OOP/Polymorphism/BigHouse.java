package OOP.Polymorphism;

public class BigHouse {
    public static void main(String[] args) {

//        Dog dog=new Dog();
//        dog.voice(3,"laika");
//        dog=new BigDog();
//        dog.voice(2,"Buran");

        Dog dog2=new Dog(1,"Polkan");
        dog2.voice();
        dog2=new BigDog(2,"Reks");
        dog2.voice();
    }
}
