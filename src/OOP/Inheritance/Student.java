package OOP.Inheritance;

public class Student extends Human {

    int course;
    String university;

//    public Student(){
//        this.course=course;
//        this.university=university;
//    }
public void info(int age, String gender,String race,int course,String university){
    System.out.println("age= "+age);
    System.out.println("gender: "+gender);
    System.out.println("race: "+race);
    System.out.println("course: "+course);
    System.out.println("university: "+university);
}
    public void info2(){
        System.out.println("age= "+age);
        System.out.println("gender: "+gender);
        System.out.println("race: "+race);
        System.out.println("course: "+course);
        System.out.println("university: "+university);
    }
}
