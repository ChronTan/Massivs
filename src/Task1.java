import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        Random rand=new Random();
        int[] mas=new int[10];

        for( int i=0;i<10;i++)
        {
            mas[i]=rand.nextInt(100);
            System.out.print(mas[i]+ " ");

        }
    }
}