/*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.*/

package homework1.Task5;

import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Task5 {
    public static void main (String[] args) {
        int[] array = {11, 3, 14, 16, 7};
        boolean isSorted = false;
        int tmp;
        Logger logger = Logger.getLogger(Task5.class.getName()); 
        FileHandler fh = new FileHandler("homework1/log.txt");  
        fh.setEncoding("UTF-8");      
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.addHandler(fh);
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
            logger.info("Next sort iteration");
        }
        logger.info("Sorting completed");
        System.out.println(Arrays.toString(array));
    }
}

