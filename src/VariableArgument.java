import com.sun.org.apache.xpath.internal.operations.Variable;

/**
 * Created by Anonymous11100001 on 4/27/2016.
 */
public class VariableArgument {
    //form 1:
    static void printVariableArguments(Object[] args){
        for(Object obj : args){
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    //Form2:
    static void printVariableArgumentVer2(Object... args){
        for(Object obj : args){
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        //Form 1:
        printVariableArguments(new Object[] {new Integer(1), new Integer(2), new Integer(3), new Integer(4)});
        printVariableArguments(new Object[] {"One", "Two", "Three", "Four"});
        printVariableArguments(new Object[] {new VariableArgument(), new VariableArgument(), new VariableArgument()});

        //Form 2:
        printVariableArgumentVer2(new Integer(1), new Integer(2), new Integer(3));
        printVariableArgumentVer2("Five", "Six", "Seven");
        printVariableArgumentVer2(new VariableArgument(), new VariableArgument(), new VariableArgument());
        //Or a Array
        printVariableArgumentVer2((Object[]) new Integer[]{1,2,3});
        printVariableArgumentVer2((Object[]) new String[]{"abc", "cdf", "efg", "tyu"});
        printVariableArgumentVer2();
    }
}
