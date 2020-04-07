import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(Arrays.asList(100, 500, 900));
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(Arrays.asList(800,600,300));
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>(Arrays.asList(400,700,200));
        
        ArrayOrganizer org = new ArrayOrganizer();
        System.out.println("Result => " + org.concatAndSort(arrayList1, arrayList2, arrayList3));
    }
}