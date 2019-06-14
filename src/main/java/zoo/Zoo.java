package zoo;

import zoo.cat.Cat;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Zoo {

    private final Cat cat;
    private final Elephant elephant;
    private final Animal surprise;

    @Inject
    public Zoo(final Cat cat, final Elephant elephant, final Animal surprise) {
        this.cat = cat;
        this.elephant = elephant;
        this.surprise = surprise;
    }

    public static void main(String args[]) {
        System.out.println();
        Zoo zoo = DaggerZooComponent.create().buildZoo();
        System.out.println("Cat: " + zoo.cat.whoAmI());
        System.out.println("Elephant: " + zoo.elephant.makeNoise());
        System.out.println("Surprise : " + zoo.surprise.whoAmI());

    }
}
