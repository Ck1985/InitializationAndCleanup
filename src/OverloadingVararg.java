/**
 * Created by Anonymous11100001 on 4/28/2016.
 */
public class OverloadingVararg {
    static void f(Character...args){
        System.out.println("The First Method");
        for(Character c : args){
            System.out.print(c + " ");
        }
        System.out.println();
    }

    static void f(Integer...args){
        System.out.println("The Second Method");
        for(Integer i : args){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void f(Long...args){
        System.out.println("The Third method");
        for(Long l : args){
            System.out.print(l + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        f('a', 'b', 'c', 'd');
        f(1,2,3,4,5);
        f(new Integer(1), new Integer(2), new Integer(3));
        f(0L);
        f(567L, 87L, 12L, 3L);
        // f(); Error:(35, 9) java: reference to f is ambiguous
        //      both method f(java.lang.Integer...) in OverloadingVararg and method f(java.lang.Long...)
        // in OverloadingVararg match
    }
}
