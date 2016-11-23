/**
 * Created by CK1985 on 4/20/2016.
 */
public class SimpleConstructor {
    public static void main(String[] args){
        /*for(int i = 0; i < 10; i++){
            new Rock();
        }*/

        /*for(int i = 1; i <= 5; i++){
            new Rock2(i);
        }*/

        /*StringReference strRef = new StringReference();
        System.out.println(strRef.str);*/

        InitializeByUser iniUser = new InitializeByUser();
        InitializeByconstrucotr iniCons = new InitializeByconstrucotr();

        System.out.println(iniUser.str);
        System.out.println(iniCons.str);
    }
}
