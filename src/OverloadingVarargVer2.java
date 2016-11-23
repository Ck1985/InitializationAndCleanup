/**
 * Created by Anonymous11100001 on 4/28/2016.
 */
public class OverloadingVarargVer2 {
    static void f(Character...args){
        System.out.println("The first method");
        for(Character c : args){
            System.out.print(c + " ");
        }
        System.out.println();
    }

    static void f(int index, Character...args){
        System.out.println("The second method");
        for(Character c : args){
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        f(1, 'a', 'b', 'c', 'd');
    }
}
