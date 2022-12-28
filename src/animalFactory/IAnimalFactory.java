package animalFactory;

import animal.IBear;
import animal.ICat;
import animal.IDuck;

/**
 * creator. Class representing general creation of an animal
 */
public interface IAnimalFactory {
    ICat createCat();
    IBear createBear();
    IDuck createDuck();
}
