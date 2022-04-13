package day25_CustomMethod_Overoading;

public class MinNumber_Overloading {
    public static void main(String[] args) {
        int[] numbers={1,5,0,-9,6,5};

        System.out.println(min(numbers));
    }
    public static int min(int[] numbers){
        int min=numbers[0];
        for (int each:numbers) {
            if(each<min){
                min=each;
            }
        }
        return min;

    }
    public static double min(double[] numbers){
        double min=numbers[0];
        for (double each:numbers) {
            if(each<min){
                min=each;
            }
        }
        return min;

    }
    public static char min(char[] numbers){
        char min=numbers[0];
        for (char each:numbers) {
            if(each<min){
                min=each;
            }
        }
        return min;

    }
    public static long min(long[] numbers){
        long min=numbers[0];
        for (long each:numbers) {
            if(each<min){
                min=each;
            }
        }
        return min;

    }
    public static short min(short[] numbers){
        short min=numbers[0];
        for (short each:numbers) {
            if(each<min){
                min=each;
            }
        }
        return min;

    }
    public static float min(float[] numbers){
        float min=numbers[0];
        for (float each:numbers) {
            if(each<min){
                min=each;
            }
        }
        return min;

    }
    public static byte min(byte[] numbers){
        byte min=numbers[0];
        for (byte each:numbers) {
            if(each<min){
                min=each;
            }
        }
        return min;

    }
}
