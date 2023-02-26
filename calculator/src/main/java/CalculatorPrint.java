public class CalculatorPrint {
    static String add(Integer a, Integer b) {
        Integer c = a + b;
        return c.toString();
    }

    public static void main(String[] args) {
        String stringSum = add(5, 4);
        System.out.println(stringSum);
    }
}
