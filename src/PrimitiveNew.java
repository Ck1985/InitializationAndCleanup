/**
 * Created by Anonymous11100001 on 4/26/2016.
 */
import java.util.Arrays;
import java.util.Random;

public class PrimitiveNew {
    public static void main(String[] args){
        int[] arr;
        Random rand = new Random(100);
        int lengthArray = rand.nextInt(40);
        arr = new int[lengthArray];
        System.out.println("Length of Array = "+ arr.length);
        /*for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }*/
        System.out.print(Arrays.toString(arr));
    }
}
