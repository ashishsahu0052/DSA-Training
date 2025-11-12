import java.io.File;
import java.util.Scanner;

public class InoutDemo {
    public static void main(String[] args) {
        // Scanner sc = new Scanner("hello how are you");
        Scanner sc = new Scanner(new File("C:\\Users\\ashis\\Desktop\\dsa_training\\Firstclass.java"));
        while (sc.hasNext()) {
            System.out.println(sc.next());

        }
    }
}
