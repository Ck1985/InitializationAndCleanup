/**
 * Created by Anonymous11100001 on 4/24/2016.
 */
public class MethodInt3{
    //int j = foo2(i); //Error Illegal forward reference ( boi vi bien i van chua duoc khoi tao)q
    int i = foo();
    int foo(){
        return 3;
    }
    int foo2(int n){
        return n * 4;
    }
}
