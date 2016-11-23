/**
 * Created by CK1985 on 4/20/2016.
 */
public class Tree {
    int height;
    Tree(){
        System.out.println("Plant a seeding");
        height = 0;
    }
    Tree(int iniheight){
        height = iniheight;
        System.out.println("Creating a tree has " + height + " feet tall");
    }
    void info(){
        System.out.println("The tree had "+ height + " feet tall");
    }
    void info(String s){
        System.out.println(s + "The tree has " + height + " feet tall");
    }
}
