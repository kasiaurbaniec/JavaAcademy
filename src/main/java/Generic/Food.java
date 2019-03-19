package Generic;

public abstract class Food {
   protected final String name;
   protected final int weight;

    protected Food(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    abstract void prepare();

}
