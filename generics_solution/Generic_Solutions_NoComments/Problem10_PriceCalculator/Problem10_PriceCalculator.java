import java.util.*;
class Product { double p; Product(double p){this.p=p;} double get(){return p;} }
class Mobile extends Product { Mobile(double p){super(p);} }
class Laptop extends Product { Laptop(double p){super(p);} }
public class PriceCalculator {
    public static double total(List<? extends Product> list){
        double t = 0;
        for(Product p:list) t += p.get();
        return t;
    }
    public static void main(String[] args){
        System.out.println(total(Arrays.asList(new Mobile(100))));
    }
}