/**
 * Created by Anonymous11100001 on 4/25/2016.
 */
import static net.mindview.util.Print.*;
public class Table {
    static Bowl bowl1 = new Bowl(1);
    Table(){
        print("Table()");
        bowl2.f1(1);
    }
    void f2(int marker){
        print("f2(" +  marker + ")");
    }
    static Bowl bowl2 = new Bowl(2);
}
