package OOP.Incapsulations;

public class Person {
    private String name="Misha";
    private String model;
    private int number=111;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }
    public void step(int age,String name){
        System.out.println("age: "+age);
        System.out.println("name: "+ name);
    }
    public void step(int age){
        System.out.println("age: "+age);
        System.out.println("name: "+ "NoName");
    }

}
