package designpatterns;

/**
 * Created by Winnah Gwen Acal on 11/24/2016.
 */
public class CharacterTest {
    public static void main(String[] args) {
        Character c1 = new Queen();
        c1.setWeapon(new AxeBehavior());
        c1.fight();

        Character c2 = new King();
        c2.setWeapon(new BowAndArrowBehavior());
        c2.fight();

        Character c3 = new Troll();
        c3.setWeapon(new KnifeBehavior());
        c3.fight();

        Character c4 = new Knight();
        c4.setWeapon(new SwordBehavior());
        c4.fight();




    }
}
