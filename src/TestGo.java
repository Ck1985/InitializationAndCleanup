/**
 * Created by Anonymous11100001 on 4/26/2016.
 */
public class TestGo {
    public static void main(String[] args){
        System.out.println("Inside main()");
        Go.showfieldStatic();
        System.out.println("Go.s1 = " + Go.s1);
    }
    static Go g1 = new Go();
    static Go g2 = new Go();
    static Go g3 = new Go();
    static Go g4 = new Go();
    static Go g5 = new Go();
}
