package OOP.Polymorphism;

public class Dog {
    int age;
    String name;

    public void voice(int age, String name){
        for(int i=0;i<age;i++){
            System.out.println(name+": "+" gav-gav");
        }
    }
}
