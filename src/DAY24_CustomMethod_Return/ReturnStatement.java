package DAY24_CustomMethod_Return;

public class ReturnStatement {
    public static void main(String[] args) {
        nameOfDay(5);

    }

    public static void nameOfDay(int number){
        if(number<1||number>7) {
            System.out.println("Invalid");
            return;//exits nameOfDay method
        }
        String day=(number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?"Thusday"
                :(number==5)?"Friday":(number==6)?"Saturday":"Sunday";
        System.out.println(day);

    }
}
