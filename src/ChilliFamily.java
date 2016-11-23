/**
 * Created by Anonymous11100001 on 4/29/2016.
 */
public class ChilliFamily {
    Spiciness degree;
    ChilliFamily(Spiciness degree){
        this.degree = degree;
    }
    void description(){
        switch(this.degree){
            case NOT:
            case MIND:
                System.out.println("It is not hot at all");
                break;
            case MEDIUM:
                System.out.println("It is little hot");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("It is very hot");
        }
    }
}
