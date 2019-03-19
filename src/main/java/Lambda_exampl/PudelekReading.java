package Lambda_exampl;

import java.util.ArrayList;
import java.util.List;

public class PudelekReading {
    public static void main(String[] args) {
        List<Celebrity> celebrities = new ArrayList<Celebrity>();
        celebrities.add(new Celebrity("Justin Bieber", true, false, true));
        celebrities.add(new Celebrity("Kim Kardashian", false, false, false));
        celebrities.add(new Celebrity("Joanna Krupa", true, true, false));

        print(celebrities, c -> c.canSing());
        System.out.println("Dance");
        print(celebrities, c -> c.canDance());
        System.out.println("Act");
        print(celebrities, c -> c.canAct());
    }

    private static void print(List<Celebrity> celebrities, CheckTalent checker) {
        for (Celebrity celebrity : celebrities) {
            if (checker.test(celebrity)) {
                System.out.println(celebrity + " ");
            }
            System.out.println();
        }
    }
}
