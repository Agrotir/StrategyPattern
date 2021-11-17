package behaviours.quack.impl;

import behaviours.quack.IDuckQuackBehaviour;

public class SimpleQuack implements IDuckQuackBehaviour {

    @Override
    public void quack() {
        System.out.println("simple quackinggggg");
    }

}
