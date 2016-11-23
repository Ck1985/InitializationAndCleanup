/**
 * Created by Anonymous11100001 on 4/23/2016.
 */
public class Tank {
    boolean filled = false;
    Tank(boolean status){
        filled = status;
    }
    void doEmpty(){
        filled = false;
    }
    protected void finalize(){
        if(filled){
            System.out.println("Error: The object Tanks still filled");
        }
    }
}
