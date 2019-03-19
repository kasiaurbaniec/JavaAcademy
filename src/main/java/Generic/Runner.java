package Generic;

public class Runner {
    public void run(){
        Chef<Nuddle> nuddleChef=new Chef<>();
        Chef<Cabbage> cabbageChef=new Chef<>();
        Chef<Beef> beefChef=new Chef<>();
        Beef beefsteak=new Beef("Beef steak",300);
        Nuddle nuddleSoup = new Nuddle("Nuddle soup", 200);
        Cabbage cabbage = new Cabbage("Cabbage", 200);
        nuddleChef.prepareMeal(nuddleSoup);
        cabbageChef.prepareMeal(cabbage);
        beefChef.prepareMeal(beefsteak);
    }
}
