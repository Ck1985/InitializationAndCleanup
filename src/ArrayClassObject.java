/**
 * Created by Anonymous11100001 on 4/26/2016.
 */
import java.util.Random;
import java.util.Arrays;

public class ArrayClassObject {
    public static void main(String[] args){
        Random rand = new Random();
        Integer[] arrObj;
        arrObj = new Integer[rand.nextInt(20)];
        System.out.println("Length of array = " + arrObj.length);
        for(int i = 0; i < arrObj.length; i++){
            arrObj[i] = rand.nextInt(30); // Auto Boxing
        }
        System.out.print(Arrays.toString(arrObj));
    }
}
