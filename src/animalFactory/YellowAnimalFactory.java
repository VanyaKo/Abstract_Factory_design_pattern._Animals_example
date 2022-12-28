package animalFactory;

import animal.*;

/**
 * class to produce yellow animal-toys
 */
public class YellowAnimalFactory implements IAnimalFactory {
    @Override
    public ICat createCat() {
        return new YellowCat();
    }

    @Override
    public IBear createBear() {
        return new YellowBear();
    }

    @Override
    public IDuck createDuck() {
        return new YellowDuck();
    }
}
