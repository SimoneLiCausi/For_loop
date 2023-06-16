import java.util.ArrayDeque;
import java.util.ArrayList;

public class Exercise {

    public static void main(String[] args) {

        //Use a for-loop to print all the number from 5 to 25 (including the upper and lower bound)

        ArrayList<Integer> someNumbersToPrint = new ArrayList<>();
        someNumbersToPrint.add(5);
        someNumbersToPrint.add(6);
        someNumbersToPrint.add(7);
        someNumbersToPrint.add(8);
        someNumbersToPrint.add(9);
        someNumbersToPrint.add(10);
        someNumbersToPrint.add(11);
        someNumbersToPrint.add(12);
        someNumbersToPrint.add(13);
        someNumbersToPrint.add(14);
        someNumbersToPrint.add(15);
        someNumbersToPrint.add(16);
        someNumbersToPrint.add(17);
        someNumbersToPrint.add(18);
        someNumbersToPrint.add(19);
        someNumbersToPrint.add(20);
        someNumbersToPrint.add(21);
        someNumbersToPrint.add(22);
        someNumbersToPrint.add(23);
        someNumbersToPrint.add(24);
        someNumbersToPrint.add(25);


        ArrayList<Integer> myNumbers = someNumbersToPrint;

        for (int i = 0; i < myNumbers.size(); i++) {
            int printNumbers = myNumbers.get(i);
            System.out.println(printNumbers);

        }

        System.out.println("Altrimenti, con un semplice ciclo for:");

        for(int x = 5; x <= 25; x++) {
            System.out.println(x);
        }

    }
}
