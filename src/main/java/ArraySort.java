import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    protected void sort() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ile liczb musiz wylosować?");
        int ilośćLiczb = scanner.nextInt();
        System.out.println("jaka jest największa liczba?");
        int max = scanner.nextInt();
        int[] numbers = new int[max];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += i;
        }
        int[] result = new int[ilośćLiczb];
        for (int i = 0; i < result.length; i++) {
            int res = (int) (Math.random() * max);
            result[i] = numbers[res];
            numbers[res] = numbers[max - 1];
            max--;
        }
        Arrays.sort(result);
        System.out.println("postaw na te liczby");
        for (int element : result) {
            System.out.println(element);
        }
    }
}
