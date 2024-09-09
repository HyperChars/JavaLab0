package lab0;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Variant8 {
//  integer
    public static int task1(int number) {
        if (number < 10 || number > 99) {
            return 0;
        }

        int tens = number / 10;
        int ones = number % 10;

        return ones * 10 + tens;
    }

//  boolean
    public boolean task2(int A, int B) {
       return (A % 2 != 0) && (B % 2 != 0);
    }

//  if
    public String task3(int a, int b) {
        if (a > b) {
            return a + " " + b;
        } else {
            return b + " " + a;
        }
    }

//  case
    public static String task4(int day, int month) {
        LocalDate date = LocalDate.of(2023, month, day);

        LocalDate previousDate = date.minusDays(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM");

        return previousDate.format(formatter);
    }

//  for
    public long task5(int A, int B) {
        long result = 1;
        for (int i = A; i <= B; i++) {
            result *= i;
        }
        return result;
    }


//  while
    public int task6(int N) {
        if (N <= 0) {
            return 0;
        }
        int K = 0;
        while ((K + 1) * (K + 1) <= N) {
            K++;
        }
        return K;
    }

//  array
    public int task7(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("Odd number: " + arr[i] + " index: " + i);
                count++;
            }
        }

        System.out.println("Count: " + count);
        return count;
    }


//  matrix
    public int[] task8(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || k < 1 || k > matrix[0].length) {
            return new int[]{0};
        }

        int[] column = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            column[i] = matrix[i][k - 1];
        }

        return column;
    }
}
