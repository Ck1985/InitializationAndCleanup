/**
 * Created by Anonymous11100001 on 4/25/2016.
 */
public class ExplicitStatic {
    public static void main(String[] args){
        System.out.println("Inside main();");
        Cups.cup1.f1(8);
    }
    static Cups cup1 = new Cups();
    static Cups cup2 = new Cups();
}
