package day35_Encapsulation.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    private String owner,location;
    private int numberOfStars;
    private ArrayList<Server> serversList=new ArrayList<>();
    private ArrayList<Chef> chefsList=new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        setOwner(owner);
        setLocation(location);
        setNumberOfStars(numberOfStars);

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public ArrayList<Server> getServersList() {
        return serversList;
    }



    public ArrayList<Chef> getChefsList() {
        return chefsList;
    }


    public void hireServer(Server server){
       this.serversList.add(server);
    }

    public void hireServers(Server[] servers){
        this.serversList.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef){
        this.chefsList.add(chef);
    }
    public void hireChef(Chef[] chefs){
        this.chefsList.addAll(Arrays.asList(chefs));
    }
    public void terminateServer(int employeeID){
        serversList.removeIf(p-> p.getEmployeeID() ==employeeID);
    }
    public void terminateChef(int employeeID){
        chefsList.removeIf(p-> p.getEmployeeID() ==employeeID);

    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", serversList=" + serversList.size() +
                ", chefsList=" + chefsList.size() +
                '}';
    }
}
/*

6.3 Create a class called Restaurant
            Attributes:
                Owner (String), Location (String),
numberOfStars (int)
                Servers (ArrayList of Server
objects)
                Chefs (ArrayList of Chef objects)
Add a constructor that sets the owner, location, and
number of stars.
            Actions: (all void methods)
                hireServer(Server server): accepts
a server object and adds it to the Servers ArrayList
                hireServer(Server [] servers):
accepts an array of Server objects and adds all of them to the Servers
ArrayList
                hireChef(Chef chef): accepts a chef
object and adds it to the Chefs ArrayList
                hireChef(Chef [] chefs): accepts an
array of Chef objects and adds all of them to the Chef ArrayList

removes the chef with the matching ID from the arraylist of chef
                terminateServer(int employeeID)
removes the server with the matching ID from the arraylist of server
                toString(): Return (String) of all
the information of a Restaurant object. No need to print the whole list of
Servers or Chefs. Print the number of Servers and Chefs along side the
other information
6.4. Create a class LocalRestaurant that has a main
method with the following:
        - Make a Restaurant object
        - Create an array of servers with their
information set. Add those initial servers to the ArrayList of Servers in
the Restaurant object
            - Create an array of chefs with their
information set. Add those initial chefs to the ArrayList of Chefs in the
Restaurant object
            - Print your whole restaurants information
 */
