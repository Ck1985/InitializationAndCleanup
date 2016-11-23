/**
 * Created by Anonymous11100001 on 4/23/2016.
 */
public class TankVer2 {
    int levelFull = 0;
    TankVer2(int level){
        levelFull = level;
    }
    TankVer2(){
        this(0);
    }
    void makeEmptyTank(){
        levelFull = 0;
    }
    void showHowFull(){
        if(levelFull == 0){
            System.out.println("Tank is empty");
        }else{
            System.out.println("Level full of this Tank is: " + levelFull);
        }
    }
    protected void finalize(){
        if(levelFull != 0){
            System.out.println("Error Tank is not empty");
        }
    }
}
