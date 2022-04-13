package day22_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        int[] arr3={7,8,9};

        int[][] arr2D={{1,2,3},{4,5,6}, {7,8,9} };
        //3 dimensional arrays contain 2d arrays


        int[][][] arr3D={{{1,2,3},{4,5,6}, {7,8,9}}, {{10,20,30},{40,50,60}, {70,80,90}} };
        //3D                          0                                   1
        //2D                0        1         2           0           1           2
        //1D                0 1 2   0 1 2   0 1 2       0  1  2    0  1  2     0  1  2
        //[index of 2D][index of 1D][index of elements]
        System.out.println(Arrays.deepToString(arr3D));//[[[1, 2, 3], [4, 5, 6], [7, 8, 9]], [[10, 20, 30], [40, 50, 60], [70, 80, 90]]]
        System.out.println(Arrays.deepToString(arr3D[1]));//[[10, 20, 30], [40, 50, 60], [70, 80, 90]]
        System.out.println(Arrays.toString(arr3D[1][1]));//[40, 50, 60]
        System.out.println(arr3D[1][1][2]);//60


        for(int[][]each2D:arr3D){
            for(int[]each:each2D){
                for(int element: each){
                    System.out.print(element+" ");
                }
            }
        }

        System.out.println("\n----------------------------------------");
        int[][][][] arr4D={    {{{1,2,3},{4,5,6}, {7,8,9}}, {{10,20,30},{40,50,60}, {70,80,90}} }       };
        //  index 4D                                        0

        for(int[][][] each3D:arr4D){
            for(int[][] each2D:each3D){
                for(int[] each1D:each2D){
                    for(int element:each1D){
                        System.out.print(element+" ");
                    }
                }
            }
        }








    }
}
