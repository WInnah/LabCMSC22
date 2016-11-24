package designpatterns;

/**
 * Created by Winnah Gwen Acal on 11/24/2016.
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon(){
        System.out.println("Thwaack... Thud");
    }
}
