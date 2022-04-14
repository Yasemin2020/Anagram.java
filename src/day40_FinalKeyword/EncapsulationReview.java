package day40_FinalKeyword;


import day39_Recap.shappeTask.Circle;
import day39_Recap.shappeTask.Square;

public class EncapsulationReview {
    private Circle circle;

    private Square square;

    public Circle getCircle(){
        return circle;
    }

    public  void setCircle(Circle circle1){

        if(circle1.getRadius() < 5){
            return;
        }

        this.circle = circle1;
    }

    public Square getSquare(){
        return square;
    }
    public void setSquare(Square square1){
        this.square= square1;
    }



}
