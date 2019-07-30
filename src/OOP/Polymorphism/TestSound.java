package OOP.Polymorphism;

public class TestSound {

    public static void main(String[] args) {
        Sound sound=new Duke();
        Sound sound1=new Juggy();
        sound.executAction();
        sound1.executAction();
        Juggy juggy=new Juggy();
        juggy.executAction();
    }
}
