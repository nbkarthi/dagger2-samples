package zoo;
import dagger.Module;
import dagger.Provides;
import zoo.cat.Cat;
import zoo.cat.DomesticCat;
import zoo.cat.Tigger;

import javax.inject.Singleton;

@Module
public class ZooModule {

    @Provides
    @Singleton
    public Cat provideCat() {
        return new Tigger();
    }

    @Provides
    @Singleton
    public Animal animal(){
        return new DomesticCat();
    }
}
