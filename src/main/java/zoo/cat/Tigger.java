package zoo.cat;

import javax.inject.Inject;


public class Tigger implements Cat {

    @Inject
    public Tigger(){}
    public String whoAmI(){
        return "Tiger!";
    }
}
