/**
 * Created by Anonymous11100001 on 4/28/2016.
 */
import java.lang.Enum;
public class SimpleUseEnum {
        public static void main(String[] args){
            /*Spiciness howHOT = Spiciness.HOT;
            System.out.println("hotHOw = " + howHOT);
            howHOT.toString();
            System.out.println(howHOT);
            for(Spiciness s : Spiciness.values()){
                System.out.println(s + " ordinal = " + s.ordinal());
            }*/

            ChilliFamily plain = new ChilliFamily(Spiciness.NOT),
                         greenChile = new ChilliFamily(Spiciness.HOT),
                         jalapeno = new ChilliFamily(Spiciness.FLAMING);
            plain.description();
            greenChile.description();
            jalapeno.description();
        }
}
