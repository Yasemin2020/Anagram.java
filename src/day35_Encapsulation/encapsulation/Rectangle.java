package day35_Encapsulation.encapsulation;

public class Rectangle {
    private int width,length;
    public int getWidth(){
        return width;
    }
    public int getLength(){
        return length;
    }

    public void setWidth(int width){
        if (width<=0){
            return;
        }
        this.width=width;
    }
    public void setLength(int length){
        if (length<=0){
            return;
        }
        this.length=length;
    }

    public Rectangle(int width, int length){
        setWidth(width);
        setLength(length);

    }

    public double calcArea(){
        return width*length;
    }
    public double calcPerimeter(){
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", Area=" + calcArea() +
                ", Perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
 Rectangle Task:
		2.1 Create a class named Rectangle:
				Private variables:
					width, length

				Encapsulate all the fields
						Conditions:
							width of the rectangle should not be negative
							length of the rectangle should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of rectangle
					calcPerimeter(): returns the perimeter of rectangle
					toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement

 */