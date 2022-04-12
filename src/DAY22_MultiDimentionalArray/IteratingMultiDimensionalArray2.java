package DAY22_MultiDimentionalArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {
        /*
        8 9 10 11 12
        4 5 6 7
        1 2 3
         */
        int[][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        for (int i = arr2D.length - 1; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]+" ");

            }

        }

        /*
        3 2 1
        7 6 5 4
        12 11 10 9 8
         */

        System.out.println();
        System.out.println("-----------------------------------------");

        for (int i = 0; i < arr2D.length; i++) {
            System.out.println();
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+" ");

            }

        }
        /*

         */
        for (int i = arr2D.length - 1; i >= 0; i--) {

            System.out.println();
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j] + " ");

            }

        }



    }
}
