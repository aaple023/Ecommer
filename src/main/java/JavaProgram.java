import java.util.Random;

public class JavaProgram {
    public static  void main(String[] args){
        Random random=new Random(100);
       int ran= random.nextInt();
        System.out.println(random.nextInt());
    }
}