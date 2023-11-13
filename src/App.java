
import java.util.Scanner;
import java.util.Arrays;

import modules.ArrayMethod;

public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        ArrayMethod arrayMethod = new ArrayMethod();
        /*
         * 1. Buatkan java program untuk menampilkan firstName, lastName, birthPlace,
         * birthYear, dan progrLangFav!
         */
        app.myBio();

        /*
         * 2. Buatkan java program untuk menampilkan angka array yang sama Input:
         * array1[]= [2,3,4,5] dan array2[] = [1,3,5,7] Output [3,5].
         */
        int[] array1 = { 2, 3, 4, 5 };
        int[] array2 = { 1, 3, 5, 7 };
        System.out.println(arrayMethod.findNumberOfTwoArray(array1, array2));
        System.out.println("\n");

        /*
         * 3. Buatkan java program untuk sorting angka dari suatu array Input array[] =
         * {3,2,4,1,5} Output array[] = {1,2,3,4,5}
         * 
         */
        int[] array = { 3, 2, 4, 1, 5 };
        System.out.println(Arrays.toString(arrayMethod.sortArray(array)));
        System.out.println("\n");

        /*
         * 4. Buatkan java program untuk mencari angka pada suatu array. Dengan sebuah
         * array sebagai berikut [163, 160, 172, 168, 166, 168.5, 170, 169, 166.5, 180]
         * 
         */
        double[] listArr = { 163, 160, 172, 168, 166, 168.5, 170, 169, 166.5, 180 };
        arrayMethod.findNumberArray(listArr, 168);
    }

    private void myBio() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Type Your First Name : ");
            String firstName = input.nextLine();
            System.out.print("Type Your Last Name : ");
            String lastName = input.nextLine();
            System.out.print("Type Your Birth Place : ");
            String birthPlace = input.nextLine();

            String result = "FirstName : " + firstName + "\n" + "Last Name : " + lastName + '\n' + "Birth Place : "
                    + birthPlace;

            System.out.println("\nBio Result \n" + result + "\n");
        }
    }
}
