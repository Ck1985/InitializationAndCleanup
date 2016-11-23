/**
 * Created by Anonymous11100001 on 4/27/2016.
 */
public class AutoBoxingVararg {
    static void printVararg(Integer...args){
        for(Integer i : args){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        printVararg(new Integer(4), new Integer(7), new Integer(8));
        printVararg(1,2,3,4);
        printVararg(5,7, new Integer(10), 5);
    }
}
