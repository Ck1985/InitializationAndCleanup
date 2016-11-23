/**
 * Created by CK1985 on 4/21/2016.
 */
public class TestDog {
    public static void main(String[] args){
        Dog obj = new Dog();
        char c = 'u';
        byte b = 5;
        short sh = 7;
        int i = 20;
        long l = 250;
        float f = 47.5f;
        double d = 72.1;
        obj.bark(c);
        obj.bark(b);
        obj.bark(sh);
        obj.bark(i, l);
        obj.bark(l, i);
        obj.bark(f);
        obj.bark(d);
    }
}
