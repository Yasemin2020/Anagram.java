package DAY22_MultiDimentionalArray;

public class Grosseries {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
//1
        for (String[] item : items) {
            System.out.println();
            for(String each:item){
                System.out.print(each+"\t");
            }

        }
        System.out.println();
 //2
        for (int i = 0; i < items.length; i++) {
            System.out.println();
            for (int j = items[i].length - 1; j >= 0; j--) {
                System.out.print(items[i][j]+"\t");

            }

        }

        System.out.println();
//3
        for (int i = items.length - 1; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j < items[i].length; j++) {


                System.out.print(items[i][j]+"\t");

            }


        }
/*
1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado

 */



    }
}
