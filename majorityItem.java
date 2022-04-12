import java.util.ArrayList;
import static java.util.Collections.sort;

class Main {
    public static void main(String[] args) {
        //Majority item of the array
        // let the array has an item that is encountered more than arrayLength/2 times
        ArrayList<Integer> array = new ArrayList<Integer> ();
        array.add(1);
        array.add(2);
        array.add(1);
        sort(array);
        int middleItem = array.size()/2;
        System.out.println(array.get(middleItem));
    }
}
