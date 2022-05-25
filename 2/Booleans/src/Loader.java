
public class Loader {
    public static void main(String[] args) {
        int milkAmount = 1000; // ml
        int powderAmount = 400; // g
        int eggsCount = 10; // items
        int sugarAmount = 10; // g
        int oilAmount = 30; // ml
        int appleCount = 8;

        boolean pancakes = powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30;
        if (pancakes){
            System.out.println("Панкейки! Поданы");
        }else {
            System.out.println("Панкейк в стоп-листе");
        }


        String answerOmlet = (milkAmount >= 300 && powderAmount >= 5 && eggsCount >=  5) ?
               "Омлет! Подан " : "Омлет в стоп-листе";
        System.out.println(answerOmlet);

        if(appleCount >= 3 &&  milkAmount >= 100 && powderAmount >= 300 && eggsCount >=4) {

            System.out.println("Яблочный пирог, подан!");
        }else {
            System.out.println("Яблочный пирог в стоп-листе");
        }
    }
}