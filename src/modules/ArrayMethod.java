package modules;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMethod {
    public ArrayList<Integer> findNumberOfTwoArray(int[] array1, int[] array2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        System.out.println("array1 : " + Arrays.toString(array1) + "\n" + "array2 : " + Arrays.toString(array2));
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) {
                    result.add(i);
                }
            }
        }

        System.out.print("Result :");
        return result;
    }

    public int[] sortArray(int[] array) {
        System.out.println("first Array :" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.print("sort Array :");
        return array;
    }

    public void findNumberArray(double[] array, double num) {
        System.out.println(Arrays.toString(array) + "\nFind Number of List Array : " + num);

        double result = 0;
        boolean isFind = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                isFind = true;
                result = array[i];
            }
        }

        if (!isFind) {
            System.out.println("Number not found!");
        } else {
            System.out.println("Number is found : " + result);

        }

    }

}
