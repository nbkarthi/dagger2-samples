package zoo;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = ZooModule.class)
public interface ZooComponent {
        Zoo buildZoo();
}
