/**
 * Created by Anonymous11100001 on 4/25/2016.
 */
public class CupBoard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    CupBoard(){
        System.out.println("CupBoard()");
        bowl4.f1(2);
    }
    void f3(int marker){
        System.out.println("f3(" + marker + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}
