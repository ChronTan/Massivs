package Classes;

public class Cat {

    int age;
    String name;
    public Cat(int age, String name){
        this.age=age;
        this.name=name;
    }
    public void voice(){
        for(int i=0;i<age;i++){
            System.out.println(name+": "+"may-may");
        }
    }
}
