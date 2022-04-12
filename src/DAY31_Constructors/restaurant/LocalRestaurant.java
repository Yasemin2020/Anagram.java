package DAY31_Constructors.restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant1=new Restaurant("Ali İhsan", "Başkarcı",5);
        Server server1=new Server("Ali",123,20,true);
        Server server2=new Server("Fatih",234,15,true);
        Server server3=new Server("Ahmet",125,20,false);
        Server server4=new Server("Selman",126,25,false);

        Server[] servers={server1,server2,server3,server4};
        restaurant1.hireServer(servers);

        Chef chef1=new Chef("Hasan",456,45,true);
        Chef chef2=new Chef("İbrahim",457,40,true);

        Chef[] chefs={chef1,chef2};
        restaurant1.hireChef(chefs);

        System.out.println(restaurant1);


    }
}
/*
6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */
