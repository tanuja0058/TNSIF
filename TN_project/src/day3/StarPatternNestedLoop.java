package day3;

public class StarPatternNestedLoop {

    public static void main(String[] args) {
        int row = 5;

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to next line after each row
        }
    }
}
