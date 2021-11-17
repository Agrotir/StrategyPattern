package Ducks;

import behaviours.fly.impl.SimpleFly;
import behaviours.quack.impl.SimpleQuack;

public class SimpleDuck extends Duck {

    public SimpleDuck() {
        super(new SimpleFly(), new SimpleQuack());
    }

}
