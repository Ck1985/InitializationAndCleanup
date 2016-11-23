/**
 * Created by Anonymous11100001 on 4/23/2016.
 */
public class Bank {
    boolean logedIn = false;
    Bank(boolean logStatus){
        logedIn = logStatus;
    }
    void logOut(){
        logedIn = false;
    }
    protected void finalize(){
        if(logedIn){
            System.out.println("Error: Still log in");
            //You also do this:
            //super.finalize(); //Call base class method
        }
    }
}
