import Ducks.CityDuck;
import Ducks.SimpleDuck;

public class App {
    public static void main(String[] args) {
        SimpleDuck sd = new SimpleDuck();
        sd.fly();

        CityDuck cd = new CityDuck();
        cd.fly();
        cd.quack();
    }
}
