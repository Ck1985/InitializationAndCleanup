/**
 * Created by Anonymous11100001 on 4/22/2016.
 */
public class Flower {
    int petalCount = 0;
    String s = "Initialize Value";

    Flower(int peltaFlowers){
        this.petalCount = peltaFlowers;
        System.out.println("Constructor has just only argument int, inipeltaFlower = " + petalCount);
    }

    Flower(String ss){
        System.out.println("Constructor has just onlu argument String, ss = " + ss);
        this.s = ss;
    }

    Flower(String ss, int peltalFlowers){
        this(peltalFlowers);
        this.s = ss;
        System.out.println("Constructor has int and String args");
    }

    Flower(){
        this("Rose", 47);
        System.out.println("Default Constructor (No args)");
    }

    void printFlowers(){
        System.out.println("s = "+ s + " peltalCount = " + petalCount);
    }
    public static void main(String[] args){
        Flower fl = new Flower();
        fl.printFlowers();
    }
}
