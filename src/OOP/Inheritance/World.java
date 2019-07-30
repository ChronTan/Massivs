package OOP.Inheritance;

public class World {

    public static void main(String[] args) {

        Human human=new Human();
        Student student=new Student();

        human.info(21,"man","russian");
        student.info(22,"man","spain",2,"cambridge");

        System.out.println("                            ");
        human.age=25;
        human.gender="female";
        human.race="us";
        student.course=4;
        student.university="MGU";
        human.info2();
        student.info2();
    }
}
