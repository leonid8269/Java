public class main {
    public static void main(String[] args) {
        int volume = 1200; //l

        int fillingSpeed = 30;
        int devastation = 10;


        int i = 0;
        while (true){
            volume -= (fillingSpeed - devastation);
            ++i;
            if (volume <= 0) break;
        }
        System.out.println(i + " минут займет наполнение бассейна!");
    }
}
