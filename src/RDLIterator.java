import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by seandunn92 on 9/4/18.
 */
public class RDLIterator implements Iterator {

    private Iterator<Character> itr;
    private int currNum;
    private char currChar;


    RDLIterator(){
        currNum=0;
        currChar= '*';
        initializeIterator("1B1r1e2t1s");
    }

    private void initializeIterator(String nameString){
        char[] nameArray = nameString.toCharArray();
        ArrayList<Character> nameArrayList= new ArrayList<Character>();
        for (char nameChar : nameArray){
            nameArrayList.add(nameChar);
        }
        itr = nameArrayList.listIterator();
    }

    @Override
    public boolean hasNext() {

        if(currNum==0)
        return itr.hasNext();
        return true;
    }

    @Override
    public Character next() {

        if(currNum==0){
            currNum = Character.getNumericValue(itr.next());
            currChar = itr.next();
        }

        currNum--;
        return currChar;
    }
}
