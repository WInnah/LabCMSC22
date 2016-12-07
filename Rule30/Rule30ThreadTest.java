/**
 * Created by Winnah Gwen Acal on 12/6/2016.
 */
public class Rule30ThreadTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int given = 30;
        Rule30.print(given);
        System.out.println("time consumed in ms: " + (System.currentTimeMillis() - startTime));
    }
}
