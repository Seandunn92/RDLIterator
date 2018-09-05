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

        RDLIterator rDLIterator = new RDLIterator();

        while (rDLIterator.hasNext()){
            System.out.print(rDLIterator.next());
        }
    }
}
