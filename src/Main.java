import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by seandunn92 on 9/4/18.
 */
public class Main {

    public static void main (String[] args) {

        SimpleIterator simpleIterator = new SimpleIterator();
        while (simpleIterator.hasNext()){
            System.out.print(simpleIterator.next());
        }

        System.out.println();
        System.out.println();

        RLDIterator rldIterator = new RLDIterator();

        while (rldIterator.hasNext()){
            System.out.print(rldIterator.next());
        }
    }
}
