public class Discount {
    public static int setDiscount(int price, double discount) {
        int after_discount = (int)((price * (1 - discount)));

        return (after_discount);
    }

    public String calcRate(double rate1, double rate2) {
        if (rate1 > rate2) {
            return "OK";
        } else {
            return "NG";
        }
    }

    public boolean priceCheck(int price) {
        if (price >= 50000) {
            return true;
        } else {
            return false;
        }
    }

    public double sexCheck(String sex) {
        if (sex.equals("f")) {
            return 0.2;
        } else {
            return 0.1;
        }
    }

    public int ageCheck(int age) {
        if (age < 20) {
            return 3000;
        } else {
            return 1000;
        }
    }
}
