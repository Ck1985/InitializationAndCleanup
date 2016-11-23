/**
 * Created by Anonymous11100001 on 4/23/2016.
 */
public class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        if (checkedOut) {
            System.out.println("Error: Checked out");
            //Normally, you will also do this
            //super.finalize(); //Call Base class version
        }
    }
}

class TerminationConditon{
    public void main(String[] args){
        Book novel = new Book(true);
        novel.checkIn();
        Book novel2 = new Book(true);
        System.gc();
    }
}
