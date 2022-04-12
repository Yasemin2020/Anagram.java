package day35_Encapsulation.restaurant;

public class Chef {
    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean fullTime;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTime(fullTime);
    }
    public void makeOrder(){
        System.out.println(name+ " is making an order");
    }
    public void  washDishes(){
        System.out.println(name+ " is washing the dishes");
    }
    String isFullTime=(fullTime)?"full-time":"part-time";

    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                ", isFullTime='" + isFullTime() + '\'' +
                '}';
    }
}
/*
6.2 Create a class called Chef
            Attributes:
                name (String),
employeeID (int), hourlyRate (double), fullTime (boolean)
   Add A constructor that can set all the
fields
            Actions: (all void methods)
                makeOrder(): chef's
name + "is making an order"
                washDishes(): chef's
name + "is washing the dishes"
                toString(): Returns
(String) all the information of a Chef
                    -> Extra: For
fullTime status, instead of printing a boolean value, print "full-time" or
"part-time"
 */