/**
 * Created by Anonymous11100001 on 4/29/2016.
 */
public class Currency {
    public static void main(String[] args){
        for(EnumCurrency c : EnumCurrency.values()){
            System.out.println(c + " ordinary: " + c.ordinal());
        }
    }
}
