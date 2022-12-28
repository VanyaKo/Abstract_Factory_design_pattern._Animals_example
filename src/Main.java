import animal.ICat;
import animalFactory.IAnimalFactory;
import animalFactory.YellowAnimalFactory;

/**
 * driver code
 */
public class Main {
    public static void main(String[] args) {

        // abstract factory principle is coming
        IAnimalFactory yellowAnimalFactory = new YellowAnimalFactory();

        // obtain cat-toy which is produced by yellow animal factory
        ICat animal = yellowAnimalFactory.createCat();

        System.out.println(animal.determineCat());
    }
}
