/**
 * Created by Anonymous11100001 on 4/27/2016.
 */
public class VarargType {
    static void printClassName(Character...args){
        for(Character c : args) {
            System.out.print(args.getClass() + ": ");
            System.out.println("length = " + args.length);
        }
    }
    static void printPrimitive(int...args){
        for(int i : args){
            System.out.print(args.getClass() + ": ");
            System.out.println("length = " + args.length);
        }
    }
    public static void main(String[] args){
        printClassName('a', 'b', 'c');
        printPrimitive(3, 4, 5);
        printPrimitive();
        System.out.println("int[]" + new int[0].getClass());
    }
}
