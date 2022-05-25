import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        do {
            int ans = 1;
            int value = new Scanner(System.in).nextInt();

            for ( ; value > 0; value--) {
                ans *= value;
            }

            System.out.println(ans);
        }while (true);

    }
}
