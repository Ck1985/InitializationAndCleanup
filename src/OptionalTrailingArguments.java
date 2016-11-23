/**
 * Created by Anonymous11100001 on 4/27/2016.
 */
public class OptionalTrailingArguments {
    static void printOptional(int index, String... args){
        System.out.print(index + "/ ");
        for(String s : args){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        printOptional(1, "One", "Two", "Three", "Four");
        printOptional(2, "Anonymous", "11100001");
        printOptional(3);
    }
}
