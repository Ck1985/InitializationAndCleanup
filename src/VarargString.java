/**
 * Created by Anonymous11100001 on 4/28/2016.
 */
public class VarargString {
    static void f(String...args){
        System.out.println("This is the variable argument method has String type");
        for(String s : args){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        //We can pass a list String to above method or String[]. Example:
        f("We", "are", "the", "Demon Hacking");
        String[] arr1 = {
                "What",
                "is",
                "your",
                "name",
                "GoodLuck",
        };
        f(arr1);
        String[] arr2 = new String[]{
                "Don't",
                "Let",
                "me",
                "known",
                "Your",
                "Password",
                "I Will kill you",
        };
        f(arr2);
    }
}
