/**
 * Created by Anonymous11100001 on 4/26/2016.
 */
public class Go {
    static String s1 = "Go Walking";
    static String s2, s3;
    static {
        s2 = "Drive Car";
        s3 = "fly plan";
        System.out.println("s2, s3 initiliazed");
    }
    Go(){
        System.out.println("Go()");
    }
    static void showfieldStatic(){
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }
}
