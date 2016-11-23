/**
 * Created by Anonymous11100001 on 4/24/2016.
 */
import static net.mindview.util.Print.*;
public class InitializeValue {
    /*void foo(){
        /*int i;
        i++; // Error i has not initialized yet.
    }*/

    boolean bool;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitializeValue reference;

    boolean bool2 = true;
    char c2 = 'e';
    byte b2 = 127;
    short s2 = 256;
    int i2 = 1324;
    long l2 = 76531;
    float f2 = 54.2f;
    double d2 = 753.2;
    Measure mea = new Measure();

    void printInitializeValue(){
        print("Data type initialize: ");
        print("boolean " + bool2);
        print("char " + '[' + c2 + ']');
        print("byte " + b2);
        print("short " + s2);
        print("int " + i2);
        print("long " + l2);
        print("float " + f2);
        print("double " + d2);
        print("Reference " + mea);
    }

    public static void main(String[] args){
        InitializeValue iniValue = new InitializeValue();
        //iniValue.printInitializeValue();
        new InitializeValue().printInitializeValue();
    }
}
