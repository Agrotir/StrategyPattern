package behaviours.fly.impl;

import behaviours.fly.IDuckFlyBehaviour;

public class SimpleFly implements IDuckFlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Simple flying woohoo");
    }

}
