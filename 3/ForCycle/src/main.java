import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        do {
            System.out.println("Введи число: ");
            int value = new Scanner(System.in).nextInt();

            for (int i = 1 ; i <= value ; ++i){
                if(value % i  == 0) {
                    System.out.println( i + "*" + value / i);
                }

            }

        }while(true);
    }
}
