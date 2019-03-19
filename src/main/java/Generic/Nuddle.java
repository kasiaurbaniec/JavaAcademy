package Generic;

public class Nuddle extends Food {
    protected Nuddle(String name, int weight) {
        super(name, weight);
    }

    @Override
    void prepare() {
        System.out.println(name);
    }
}
