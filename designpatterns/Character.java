package designpatterns;

/**
 * Created by Winnah Gwen Acal on 11/24/2016.
 */
public abstract class Character {
    WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior weapon){
        this.weapon = weapon;
    }

    public abstract void fight();
}
