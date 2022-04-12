package day35_Encapsulation.restaurant;

public class Server {
    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean isFullTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean getFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean isFullTime) {
        this.isFullTime = isFullTime;
    }

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTime(fullTime);

    }

    public void takeOrder() {
        System.out.println(name + " is taking an order");
    }

    public void cleanTable() {
        System.out.println(name + " is cleaning the table");
    }

    public String isFullTime() {
        return (isFullTime) ? "full-time" : "part-time";


    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + isFullTime() +
                '}';
    }
}
/*
6.1  Create a class called Server
        Attributes:
                name (String), employeeID (int), 
hourlyRate (double), fullTime (boolean)
Add A constructor that can set all the fields
        Actions: (all void methods)
            takeOrder(): server's name + "is taking an 
order"
            cleanTable(): server's name + "is cleaning 
the table"
            toString(): Returns (String) all the 
information of a Server
                -> Extra: For fullTime status, 
instead of printing a boolean value, print "full-time" or "part-time"
 */