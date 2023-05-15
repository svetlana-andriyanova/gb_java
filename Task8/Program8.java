/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.*/

package Task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Program8 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arrLst = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            arrLst.add(rnd.nextInt(1,10));
        }
        System.out.println(arrLst.toString());
        int min = Collections.min(arrLst);
        int max = Collections.max(arrLst);
        int sum = 0;
        for (int i = 0; i < arrLst.size(); i++) {
            sum = sum + arrLst.get(i);
        }
        double avr = (double)sum / arrLst.size();
        System.out.printf("Максимальный элемент: %d\n",max);
        System.out.printf("Минимальный элемент: %d\n",min);
        System.out.printf("Среднее арифметическое: %.1f\n",avr);
    }
}
