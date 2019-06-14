package zoo.cat;

import javax.inject.Inject;


public class DomesticCat implements Cat {

    @Inject
    public DomesticCat(){}
    public String whoAmI(){
        return "House hold Kitty";
    }
}
