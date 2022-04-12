package day35_Encapsulation.restaurant;


public class LocalRestaurants {
    public static void main(String[] args) {
        Restaurant restaurant1=new Restaurant("Ali İhsan", "Başkarcı",5);
        Server server1=new Server("Ali",123,20,true);
        Server server2=new Server("Fatih",234,15,true);
        Server server3=new Server("Ahmet",125,20,false);
        Server server4=new Server("Selman",126,25,false);
        
        Server[] servers={server1,server2,server3,server4};
        restaurant1.hireServers(servers);

        Chef chef1=new Chef("Hasan",456,45,true);
        Chef chef2=new Chef("İbrahim",457,40,true);

        Chef[] chefs={chef1,chef2};
        restaurant1.hireChef(chefs);

        System.out.println(restaurant1);
        
        
        
        
    }
}
