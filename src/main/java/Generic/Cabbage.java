package Generic;

public class Cabbage extends Food {
   protected Cabbage(String name, int weight) {
        super(name, weight);
    }

    @Override
    void prepare() {
        System.out.println(name);

    }
}
