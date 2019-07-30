package OOP.Polymorphism;

public class BigDog extends Dog {
    int age;
    String name;

    public BigDog(){

    }
    public BigDog(int age,String name){
//        super(age,name);
        this.age=age;
        this.name=name;
    }

    public void voice(int age, String name){
        for(int i=0;i<age;i++){
            System.out.println(name+": "+" GAV-GAV");
        }
    }
    public void voice(){
        for(int i=0;i<age;i++){
            System.out.println(name+": "+" GAV-GAV");
        }
    }
}
