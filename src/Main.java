/**
 * Created by seandunn92 on 9/4/18.
 */
public class Main {
    public static RDLIterator rDLIterator;

    public static void main (String[] args) {

        SimpleIterator simpleIterator = new SimpleIterator();
        while (simpleIterator.hasNext()){
            System.out.print(simpleIterator.next());
        }

        System.out.println();
        System.out.println();

        rDLIterator = new RDLIterator();
        iterateAndPrint();


        rDLIterator = new RDLIterator("1M1a2t");
        iterateAndPrint();


    }

    public static void iterateAndPrint(){
        while (rDLIterator.hasNext()){
            System.out.print(rDLIterator.next());
        }
        System.out.println();
        System.out.println();
    }
}
