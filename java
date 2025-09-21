public class MemoryDemo {
    public static void main(String[] args) {
        String s = new String("hello");
        s = null;
        System.gc(); // Suggest garbage collection
    }
}
