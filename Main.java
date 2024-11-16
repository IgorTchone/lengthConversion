public class Main {
    public static void main(String[] args) {
        int inches = 1;
        int count = 0;

        while (inches <= 144) {
            double meters = inches / 39.37;
            System.out.println(inches + " inches = " + meters + " meters");

            inches++;
            count++;

            if (count == 12) {
                System.out.println();
                count = 0;
            }
        }
    }
}
