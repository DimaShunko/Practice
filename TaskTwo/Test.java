package TaskTwo;

public class Test {
    public static void main(String[] args) {
        LinList list = new LinList();
        list.add(5);
        list.add(2);
        list.add(23);
        list.remove(2);

        list.print();
    }
}
