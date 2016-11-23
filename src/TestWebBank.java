/**
 * Created by Anonymous11100001 on 4/23/2016.
 */
public class TestWebBank {
    public static void main(String[] args){
        WebBank bank1 = new WebBank(true);
        WebBank bank2 = new WebBank(true);

        //Proper Clean up:
        bank1.logOut();
        //Drop reference, forget clean up:
        new WebBank(true);
        //Force the garbage collections and Finalization:
        System.gc();
    }
}
