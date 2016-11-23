/**
 * Created by Anonymous11100001 on 4/26/2016.
 */
public class ArrayPrimitive {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2;
        arr2 = arr1;
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = arr2[i] + 1;
        }
        for(int i = 0; i < arr2.length; i++){
            System.out.print("arr1[" + i + "] = " + arr1[i] + " ");
        }
        System.out.println();
        for(int j = 0; j < arr1.length; j++){
            System.out.println("arr1[" + j + "] = " + arr1[j]);
        }
    }
}
