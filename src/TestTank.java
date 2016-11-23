/**
 * Created by Anonymous11100001 on 4/23/2016.
 */
public class TestTank {
    public static void main(String[] args){
        Tank tank1 = new Tank(true);
        Tank tank2 = new Tank(true);
        new Tank(true);

        tank1.doEmpty();
        System.out.println("Try 1: ");
        System.runFinalization();
        System.out.println("Try 2: ");
        Runtime.getRuntime().runFinalization();
        System.out.println("Try 3: ");
        System.gc();
        System.out.println("Try 4: ");
        System.runFinalizersOnExit(true);
    }
}
