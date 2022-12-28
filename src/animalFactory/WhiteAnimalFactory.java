package animalFactory;

import animal.*;

/**
 * class to produce white animal-toys
 */
public class WhiteAnimalFactory implements IAnimalFactory {
    @Override
    public ICat createCat() {
        return new WhiteCat();
    }

    @Override
    public IBear createBear() {
        return new WhiteBear();
    }

    @Override
    public IDuck createDuck() {
        return new WhiteDuck();
    }
}