/**
 * Created by Anonymous11100001 on 4/25/2016.
 */
public class House {
    Window window1 = new Window(1);//initialize variable reference before Constructor
    House(){
        System.out.println("We're in Constructor House");
        window3 = new Window(3);// reinitialize variabke refdrencr
    }
    Window window2 = new Window(2);// ini after Constructor
    void foo() {
        System.out.println("foo()");
    }
    Window window3 = new Window(3);// ini at the end.
}
