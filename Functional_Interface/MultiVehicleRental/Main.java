interface Rentable{void rent();void returnVehicle();}
class Car implements Rentable{public void rent(){System.out.println("Car rented");}public void returnVehicle(){System.out.println("Car returned");}}
public class Main{public static void main(String[]a){Rentable r=new Car();r.rent();r.returnVehicle();}}