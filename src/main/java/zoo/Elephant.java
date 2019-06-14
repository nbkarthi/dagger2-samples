package zoo;

import javax.inject.Inject;
import javax.inject.Singleton;

public class Elephant implements Animal {

    @Inject
    public Elephant() {
    }

    public String makeNoise() {
        return "Trumpet Trumpet..";
    }

    @Override
    public String whoAmI() {
        return "Elephant..";
    }
}
