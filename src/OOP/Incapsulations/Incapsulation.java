package OOP.Incapsulations;

public class Incapsulation {

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.getName());
        person.setName("Kirill");
        System.out.println(person.getName());

        person.setModel("Apple");
        System.out.println(person.getModel()+" "+person.getNumber());

    }
}
