/**
 * Created by CK1985 on 4/20/2016.
 */
public class Initialization {
    String str1;
    String str2 = "Hello cao xuan quy";
    String str3;

    Initialization(){
        str3 = "What is your name ???";
    }

    public static void main(String[] args){
        Initialization ini = new Initialization();
        System.out.println("ini.str1 = " + ini.str1);
        System.out.println("ini.str2 = " + ini.str2);
        System.out.println("ini.str3 = " + ini.str3);
    }
}
