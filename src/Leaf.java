/**
 * Created by Anonymous11100001 on 4/22/2016.
 */
public class Leaf {
    int i = 0;
    Leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.print("i = " + i);
    }
    public static void main(String[] args){
        Leaf obj = new Leaf();
        //obj.increment().increment().increment().increment().print();
        obj.increment().increment().increment().increment().increment().print();
        //obj.increment();
        //obj.increment();
        //obj.increment();
        //obj.print();
    }
}
