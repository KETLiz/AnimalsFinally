public class Test {
    public static void main(String[] args) {
        String test = "1aM";
        String regex = "[1-3aM]+";
        boolean res = test.matches(regex);
        System.out.println(res);
    }
}
