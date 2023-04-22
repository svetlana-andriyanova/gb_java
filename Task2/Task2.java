/*Вывести все простые числа от 1 до 1000 */
package Task2;
public class Task2 {
    public static void main(String[] args) {
        int num = 1000;
        boolean k = true;
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    k = false;
                    break;
                }
            }
            if (k) System.out.print(i + " ");
            else k = true;
        }
    }
}

