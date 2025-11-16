import java.util.*;
class Fruit { String name; Fruit(String n){name=n;} public String toString(){return name;} }
class Apple extends Fruit { Apple(){super("Apple");} }
class Mango extends Fruit { Mango(){super("Mango");} }
public class FruitBox<T extends Fruit> {
    private List<T> list = new ArrayList<>();
    public void add(T f){ list.add(f); }
    public void show(){ for(T f:list) System.out.println(f); }
    public static void main(String[] args){
        FruitBox<Fruit> b = new FruitBox<>();
        b.add(new Apple());
        b.add(new Mango());
        b.show();
    }
}