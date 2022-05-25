public class Who_old {
    public static void main(String[] args) {
        int vasyaAge = 30, katyaAge = 30, mishaAge = 1;

        int min = -1, middle = -1, max = -1;

        if (katyaAge <= vasyaAge && katyaAge <= mishaAge) min = katyaAge;
        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) min = vasyaAge;
        if (mishaAge <= vasyaAge && mishaAge <= katyaAge) min = mishaAge;

        if ((vasyaAge <= mishaAge && vasyaAge >= katyaAge) ||
                (vasyaAge >= mishaAge && vasyaAge <= katyaAge)) middle = vasyaAge;
        if ((mishaAge <= vasyaAge && mishaAge >= katyaAge) ||
                (mishaAge >= vasyaAge && mishaAge <= katyaAge)) middle = mishaAge;
        if ((katyaAge <= vasyaAge && katyaAge >= mishaAge) ||
                (katyaAge >= vasyaAge && katyaAge <= mishaAge)) middle = katyaAge;

        if (mishaAge >= katyaAge && mishaAge >= vasyaAge) max = mishaAge;
        if (vasyaAge >= mishaAge && vasyaAge >= katyaAge) max = vasyaAge;
        if (katyaAge >= mishaAge && katyaAge >= vasyaAge) max = katyaAge;



        System.out.print("Самый старший: ");
        System.out.println(max);

        System.out.print("Средний: ");
        System.out.println(middle);

        System.out.print("Младшему: ");
        System.out.println(min);

    }
}
