/**
 * Created by Anonymous11100001 on 4/26/2016.
 */
import static net.mindview.util.Print.*;
import java.util.Random;
import java.util.Arrays;

public class ArrayFormInitialization {
    public static void main(String[] args){
        Random rand = new Random();
        // Form 1:
        Integer[] arr1 = new Integer[rand.nextInt(15)];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = rand.nextInt(20);
        }
        print(Arrays.toString(arr1));

        //Form2:
        Integer[] arr2 = {
                new Integer(12),
                new Integer(23),
                7, // Auto Boxing
        };

        //Form 3:
        Integer[] arr3 = new Integer[]{
                new Integer(12),
                new Integer(23),
                7
        };
    }
}
