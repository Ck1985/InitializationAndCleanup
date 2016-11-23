/**
 * Created by CK1985 on 4/21/2016.
 */
public class Dog {
    void bark(){
        System.out.println("This dog 've just born. so it can not bark");
    }
    void bark(char c){
        System.out.println("This dog is one years old. It barks: " + c);
    }
    void bark(byte b){
        System.out.println("This dog is " + b + " years old");
    }
    void bark(short sh){
        System.out.println("This dog has " + sh + " children");
    }
    void bark(int i, long l){
        System.out.println("This dog long " + i + " cm");
        System.out.println("It has " + l + " $");
    }
    void bark(long l, int i){
        System.out.println("This dog has price " + l + " USD");
        System.out.println("Its length is " + i + " cm");
    }
    void bark(float f){
        System.out.println("This dog has weight =  " + f + " Kg");
    }
    void bark(double d){
        System.out.println("This dog height " + d + " cm");
    }
}
