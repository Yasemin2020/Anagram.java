package week08;

import java.util.Arrays;

public class A01ArrayExamples {
    public static void main(String[] args) {

        int code=200;
        int[] codes=new int[8];

        codes[0]=200;
        codes[1]=201;
        System.out.println(Arrays.toString(codes));
        int[] statusCodes={200,201,204,400,401,403,404,500};
        System.out.println("the size of array: "+statusCodes.length);

        int sizeOfArray=statusCodes.length;//8   use it for creating loops
        String[] responseTypes=new String[]{"OK","Created","No Content","Bad Request","Unautthoorized",
                "Forbidden","Not Found","Interval Server Error"};
        for (int i = 0; i <sizeOfArray ; i++) {
            String text=statusCodes[i]+":"+responseTypes[i];
            System.out.println("Each Status Code means= "+text);

        }


    }
}
