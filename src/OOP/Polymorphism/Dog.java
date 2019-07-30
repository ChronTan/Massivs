package OOP.Polymorphism;

public class Dog {
    int age;
    String name;

    public Dog(){

    }
    public Dog(int age,String name){
        this.age=age;
        this.name=name;
    }

    public void voice(int age, String name){
        for(int i=0;i<age;i++){
            System.out.println(name+": "+" gav-gav");
        }
    }
    public void voice(){
        for(int i=0;i<age;i++){
            System.out.println(name+": "+" gav-gav");
        }
    }
}
