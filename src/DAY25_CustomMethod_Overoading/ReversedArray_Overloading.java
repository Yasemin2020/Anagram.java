package DAY25_CustomMethod_Overoading;

public class ReversedArray_Overloading {
    public static void main(String[] args) {


        
    }
    public static int[] reversedArray(int[] arr){
       int[] reversedArray= new int[arr.length];
        for (int i = arr.length-1,j=0; i >0 ; i++,j++) {
            reversedArray[j]=arr[i];
        }
        return reversedArray;
    }
    public static double[] reversedArray(double[] arr){
        double[] reversedArray= new double[arr.length];
        for (int i = arr.length-1,j=0; i >0 ; i++,j++) {
            reversedArray[j]=arr[i];
        }
        return reversedArray;
    }
    public static char[] reversedArray(char[] arr){
        char[] reversedArray= new char[arr.length];
        for (int i = arr.length-1,j=0; i >0 ; i++,j++) {
            reversedArray[j]=arr[i];
        }
        return reversedArray;
    }
    public static String[] reversedArray(String[] arr){
        String[] reversedArray= new String[arr.length];
        for (int i = arr.length-1,j=0; i >0 ; i++,j++) {
            reversedArray[j]=arr[i];
        }
        return reversedArray;
    }
}
