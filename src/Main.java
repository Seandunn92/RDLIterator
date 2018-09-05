import java.util.Scanner;

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

        Scanner scan = new Scanner(System.in);
        String input = "stop";
        do{
            System.out.println("Enter the RDL String, Enter Stop to stop the program");
            input=scan.next();
            scan.nextLine();
            rDLIterator = new RDLIterator(input);
            System.out.println();
            System.out.println("Here is your translation:");
            iterateAndPrint();


        }while (!input.toLowerCase().equals("stop"));

    }

    public static void iterateAndPrint(){
        while (rDLIterator.hasNext()){
            System.out.print(rDLIterator.next());
        }
        System.out.println();
        System.out.println();
    }
}
