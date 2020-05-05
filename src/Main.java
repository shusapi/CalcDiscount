
public class Main {

    public static final double DISCOUNT = 0.2;
    public static final int PRICE = 1000;

    public static void main(String[] args) {

        Discount discount = new Discount();
        int after_price = discount.setDiscount(PRICE,DISCOUNT);

        System.out.println("値引き後の金額は" + after_price + "です。");
    }
}
