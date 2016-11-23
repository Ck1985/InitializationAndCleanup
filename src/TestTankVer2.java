/**
 * Created by Anonymous11100001 on 4/23/2016.
 */
public class TestTankVer2 {
    public static void main(String[] args){
        TankVer2 tank1 = new TankVer2();
        TankVer2 tank2 = new TankVer2(5);
        TankVer2 tank3 = new TankVer2(8);
        new TankVer2(7);

        tank2.makeEmptyTank();

        System.out.println("Check Tank:");
        System.out.println("Tank 1: " + tank1.levelFull);
        System.out.println("Tank 2: " + tank2.levelFull);
        System.out.println("Tank 3: " + tank3.levelFull);

        System.out.println("The first  force gc:");
        System.gc();
        System.out.println("Try predecated runFinalizerOnExit()");
        System.runFinalizersOnExit(true);
        System.out.println("The last force gc()");
        System.gc();
    }
}
