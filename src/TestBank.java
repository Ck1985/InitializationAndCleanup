/**
 * Created by Anonymous11100001 on 4/23/2016.
 */
public class TestBank {
    public static void main(String[] args){
        Bank bank1 = new Bank(true);
        Bank bank2 = new Bank(true);
        new Bank(true);

        //Log out bank1 before come back Home This is proper clean up
        bank1.logOut();
        bank2.logOut();
        //We forgot log out bank2 and unnamed the new bank.
        //So we attemp to finalize any missed bank:
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
