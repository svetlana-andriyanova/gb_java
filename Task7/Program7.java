package Task7;

import java.util.ArrayList;

public class Program7 {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<>();
        digits.add(1);
        digits.add(2);
        digits.add(3);
        digits.add(4);
        digits.add(5);
        digits.add(6);
        System.out.println("Список всех чисел: " + digits);
        digits.removeIf(n -> n % 2 == 0);
        System.out.println("Список четных чисел: "+ digits);
    }
}
