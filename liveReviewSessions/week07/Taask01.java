package week07;

public class Taask01 {
    public static void main(String[] args) {/*
    rows=5
    colums=5
    */
        int rowCount=5;
        for (int row = 1; row <=rowCount ; row++) {
            int value=row;
            for (int col = 1; col <=row ; col++) {
                System.out.print(value+" ");
                value+=rowCount-col;

                }

            System.out.println();
            }


        }
    }

