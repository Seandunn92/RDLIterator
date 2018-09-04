import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by seandunn92 on 9/4/18.
 */
public class SimpleIterator implements Iterator {

    private Iterator<Character> itr;

    SimpleIterator(){
        char[] nameArray = "Brett".toCharArray();
        ArrayList<Character>  nameArrayList= new ArrayList<Character>();
        for (char nameChar : nameArray){
            nameArrayList.add(nameChar);
        }
        itr = nameArrayList.listIterator();

    }

    @Override
    public boolean hasNext() {
        return itr.hasNext();
    }

    @Override
    public Character next() {
        return itr.next();
    }
}
