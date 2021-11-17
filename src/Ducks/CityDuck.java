package Ducks;

import behaviours.fly.impl.QuirkyFly;
import behaviours.quack.impl.SimpleQuack;

public class CityDuck extends Duck {

    public CityDuck() {
        super(new QuirkyFly(), new SimpleQuack());
    }

}
