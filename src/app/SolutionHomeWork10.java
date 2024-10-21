package app;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionHomeWork10 {
    public static final double PI = 3.141592653589793;

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[] array = new int[]{10, 20, 30, 40, 50};
        double r = 3.499855607449582277;
        double h = 10.0;
        int a = 0;
        int b = 0;
        String text = null;

        System.out.print("1. Введіть ціле число: ");
        a = scn.nextInt();
        System.out.println("Квадрат числа " + a + " дорівнює " + calculatesquarenumber(a) + ".");
        System.out.println();

        System.out.printf("2. Об'єм циліндра з радіусом %.1f і висотою %.1f дорівнює %.14f.%n",
                r, h, calculatecylindercapacity(r, h));
        System.out.println();

        System.out.println("3. Масив чисел: " + Arrays.toString(array));
        System.out.println("  Сума всіх елементів масиву дорівнює " + calculatesum(array) + ".");
        System.out.println();

        System.out.print("4. Введіть рядок: ");
        text = scn.next();
        System.out.println("  Рядок в зворотньому порядку: " + revers(text));
        System.out.println();

        System.out.print("5. Введіть a: ");
        a = scn.nextInt();
        System.out.print("  Введіть b: ");
        b = scn.nextInt();
        System.out.println("  Результат " + a + "^" + b + " дорівнює " + calculatepower(a, b) + ".");
        System.out.println();

        System.out.print("6. Введіть ціле число n: ");
        a = scn.nextInt();
        System.out.print("  Введіть текстовий рядок: ");
        text = scn.next();
        System.out.print(textdisplay(a, text));

        scn.close();
    }

    public static int calculatesquarenumber(int insertNumber) {
        int square = insertNumber * insertNumber;
        return square;
    }

    public static double calculatecylindercapacity(double r, double h) {
        double capacity = Math.PI * Math.pow(r, 2) * h;
        return capacity;
    }

    public static int calculatesum(int[] array) {
        int sum = 0;
        for (int i : array)
            sum += i;
        return sum;
    }

    public static String revers(String input) {
        if (input == null) {
            return input;
        }
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }
        return output;
    }

    public static long calculatepower(int a, int b) {
        Long power = 1L;
        while (b != 0) {
            power *= a;
            b--;
        }
        return power;
    }

    public static String textdisplay(int n, String text) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + text + "\n";
        }
        return result;
    }
}
