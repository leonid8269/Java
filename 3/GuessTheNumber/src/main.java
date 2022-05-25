import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int value = new Random().nextInt(100);
        //System.out.println(value);
        while (true){

            int attempt = new Scanner(System.in).nextInt();
            if (attempt == value){
                System.out.println("Вы угадали число!");
            }else if (attempt > value){
                System.out.println("Загаданное число ниже введенного!");
            }else {
                System.out.println("Загаданное число больше введенного!");
            }
        }


    }
}
