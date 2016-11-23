/**
 * Created by Anonymous11100001 on 4/23/2016.
 */
public class WebBank {
    boolean logedIn = false;
    WebBank(boolean logStatus){
        logedIn = logStatus;
    }
    void logIn(){
        logedIn = true;
    }
    void logOut(){
        logedIn = false;
    }
    protected void finalize(){
        if(logedIn) {
            System.out.print("Error: Still log in");
        }
        //Normally: you also do this:
        //super.finalize()//Call base class
    }
}
