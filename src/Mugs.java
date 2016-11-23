/**
 * Created by Anonymous11100001 on 4/26/2016.
 */
public class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 and mug2 has initialized");
    }
    Mugs(){
        System.out.println("Mugs()");
    }
    Mugs(int marker){
        System.out.println("Mugs(" + marker + ")");
    }
    public static void main(String[] args){
        System.out.println("Inside main()");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");
    }
}
