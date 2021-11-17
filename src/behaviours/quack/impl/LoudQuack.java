package behaviours.quack.impl;

import behaviours.quack.IDuckQuackBehaviour;

public class LoudQuack implements IDuckQuackBehaviour {

    @Override
    public void quack() {
        System.out.println("*SCREAMSS*");
    }

}
