public class Main {
    public static void main(String[] args) {
        int amountInRegular = 100;
        int amountInHigh = 1000;
        int amountInSpecial = 10_000;

        int percentInRregular = 1;
        int percentInHigh = 5;
        int percentInSpecial = 30;
        int result = (amountInRegular * percentInRregular +
                amountInHigh * percentInHigh +
                amountInSpecial * percentInSpecial) / 100;
        int cashback;
        if (result > 3_000) {
            cashback = 3000;
        } else {
            cashback = 3000;
        }
            System.out.println(cashback);
        }


    }