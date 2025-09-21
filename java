import java.util.ArrayList;

public class MemoryDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list = null; // Eligible for garbage collection
        System.gc(); // Request garbage collection
    }
}
