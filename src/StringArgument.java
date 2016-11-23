/**
 * Created by Anonymous11100001 on 4/27/2016.
 */
public class StringArgument {
    StringArgument(String arg)
    {
        System.out.print(arg + " ");
    }
    public static void main(String[] args){
        StringArgument[] arr;
        arr = new StringArgument[4];
        StringArgument obj0 = new StringArgument("Hi");
        StringArgument obj1 = new StringArgument("How are you");
        StringArgument obj2 = new StringArgument("I am atacking you");
        StringArgument obj3 = new StringArgument("Good Luck");
        arr[0] = obj0;
        arr[1] = obj1;
        arr[2] = obj2;
        arr[3] = obj3;

        for(StringArgument s : arr){
            System.out.print(s + " ");
        }
    }
}
