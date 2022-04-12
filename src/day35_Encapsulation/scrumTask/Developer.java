package day35_Encapsulation.scrumTask;

public class Developer {
    private String name;
    private long employeeID;
    private String jobTitle;
    private double salary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Developer(String name, long employeeID, String jobTitle, double salary) {
        setName(name);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", Salary=" + salary +
                '}';
    }
    public void coding(){
        System.out.println(name +" is coding");
    }
    public void unitTesting(){
        System.out.println(name+ "is unit testing");
    }
    public void fixingBug(){
        System.out.println(name+ " is fixing bug");
    }

}
