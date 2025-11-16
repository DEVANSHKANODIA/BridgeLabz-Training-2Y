import java.util.*;
class Vehicle { String id; Vehicle(String i){id=i;} public String toString(){return id;} }
class Truck extends Vehicle { Truck(String i){super(i);} }
class Bike extends Vehicle { Bike(String i){super(i);} }
public class FleetManager<T extends Vehicle> {
    private List<T> list = new ArrayList<>();
    public void add(T v){ list.add(v); }
    public void show(){ for(T x:list) System.out.println(x); }
    public static void main(String[] args){
        FleetManager<Truck> f = new FleetManager<>();
        f.add(new Truck("T1"));
        f.show();
    }
}