import java.util.Scanner;

public class Main {
    static int[] liczba = new int[10];

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            fillArray();
        for (int n : liczba)
            System.out.println(n);
    }

    public static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0)
            throw new NegativeNumberException();
        return number;
    }
    static int numbersCount = 0;
    public static void fillArray() {
        try {
            int number = readNumber();
            liczba[numbersCount] = number;
        } catch (NegativeNumberException e) {
            liczba[numbersCount] = 0;
            System.out.println(e);
        } finally {
            numbersCount++;
        }
    }
}