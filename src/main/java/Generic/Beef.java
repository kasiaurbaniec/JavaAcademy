package Generic;

public class Beef extends Food {
    protected Beef(String name, int weight) {
        super(name, weight);
    }

    @Override
    void prepare() {
        System.out.println(name);
    }
}
