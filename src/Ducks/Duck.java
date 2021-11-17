package Ducks;

import behaviours.fly.IDuckFlyBehaviour;
import behaviours.quack.IDuckQuackBehaviour;

public class Duck {

    IDuckFlyBehaviour duckFlyBehaviour;
    IDuckQuackBehaviour duckQuackBehaviour;

    public Duck(IDuckFlyBehaviour duckFlyBehaviour, IDuckQuackBehaviour duckQuackBehaviour) {
        this.duckFlyBehaviour = duckFlyBehaviour;
        this.duckQuackBehaviour = duckQuackBehaviour;
    }

    public void fly() {
        this.duckFlyBehaviour.fly();
    }

    public void quack() {
        this.duckQuackBehaviour.quack();
    }

}
