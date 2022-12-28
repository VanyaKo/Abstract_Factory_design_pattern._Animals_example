package animalFactory;

import animal.*;

/**
 * class to produce brown animal-toys
 */
public class BrownAnimalFactory implements IAnimalFactory {
    @Override
    public ICat createCat() {
        return new BrownCat();
    }

    @Override
    public IBear createBear() {
        return new BrownBear();
    }

    @Override
    public IDuck createDuck() {
        return new BrownDuck();
    }
}