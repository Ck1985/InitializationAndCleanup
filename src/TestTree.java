/**
 * Created by CK1985 on 4/20/2016.
 */
public class TestTree {
    public static void main(String[] args){
        for (int i = 0; i <= 5; i++){
            Tree t = new Tree(i);
            t.info();
            t.info("Overloaded Method");
        }
        //Overloaded Constructor
        Tree t = new Tree();
    }
}
