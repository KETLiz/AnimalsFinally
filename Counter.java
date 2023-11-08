public class Counter {
    private static int count = 0;

    public int add() {
        return count++;
    }

    public int getCount() {
        return count;
    }

    public void printCount() {
        System.out.println(getCount());
    }
}