package OOP.Inheritance;

public class Human {
    int age;
    String gender;
    String race;
//    public Human(int age, String gender,String race){
//        this.age=age;
//        this.gender=gender;
//        this.race=race;
//    }

    public void info(int age, String gender,String race){
        System.out.println("age= "+age);
        System.out.println("gender: "+gender);
        System.out.println("race: "+race);
    }
    public void info2(){
        System.out.println("age= "+age);
        System.out.println("gender: "+gender);
        System.out.println("race: "+race);
    }
}
