public class PriceDisplay {
    public static void main(String[] args) {

    }

    String getPriceLabel(String item, Double price) {
        String p = Double.toString(price);
        String label = String.format("The price for item: %s is %s", item, p);
        return label;
    }
}
