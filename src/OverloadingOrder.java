/**
 * Created by CK1985 on 4/21/2016.
 */
public class OverloadingOrder {
    static void foo(int i, String str){
        System.out.println("i = " + i + " String = " + str);
    }
    static void foo(String str, int i){
        System.out.println("String = " + str + " i = " + i);
    }
    public static void main(String[] args){
        foo(5, "Anonymous");
        foo("Virus", 10);
    }
}
