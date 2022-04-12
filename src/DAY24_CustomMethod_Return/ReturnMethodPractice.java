package DAY24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        int maxNumber=max(100,200);
        int multiplication=maxNumber*2;
        System.out.println(multiplication);

        //find the max number between 100&200

        //multiply the max number by 2
    }

    public static int max(int a,int b){
        int result=0;
        if (a>b){
            result=a;
        }else{
            result=b;
        }
        return result;
    }


}
