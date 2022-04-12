package DAY25_CustomMethod_Overoading;

public class MaxNumber_Overloading {
    public static void main(String[] args) {
int[] numbers={1,5,0,-9,6,5};

        System.out.println(max(numbers));

        
    }

    public static int max(int[] numbers){
        int max=numbers[0];
        for (int each:numbers) {
            if(each>max){
                max=each;
            }
        }
        return max;

    } 
    public static double max(double[] numbers){
        double max=numbers[0];
        for (double each:numbers) {
            if(each>max){
                max=each;
            }
        }
        return max;

    } 
    public static char max(char[] numbers){
        char max=numbers[0];
        for (char each:numbers) {
            if(each>max){
                max=each;
            }
        }
        return max;

    } 
    public static long max(long[] numbers){
        long max=numbers[0];
        for (long each:numbers) {
            if(each>max){
                max=each;
            }
        }
        return max;

    }
    public static short max(short[] numbers){
        short max=numbers[0];
        for (short each:numbers) {
            if(each>max){
                max=each;
            }
        }
        return max;

    }
    public static float max(float[] numbers){
        float max=numbers[0];
        for (float each:numbers) {
            if(each>max){
                max=each;
            }
        }
        return max;

    }
    public static byte max(byte[] numbers){
        byte max=numbers[0];
        for (byte each:numbers) {
            if(each>max){
                max=each;
            }
        }
        return max;

    }
}
