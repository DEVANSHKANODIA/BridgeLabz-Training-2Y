import java.util.*;
class Animal { String n; Animal(String n){this.n=n;} public String toString(){return n;} }
class Dog extends Animal { Dog(String n){super(n);} }
class Cat extends Animal { Cat(String n){super(n);} }
public class AnimalPrinter {
    public static void print(List<? extends Animal> a){
        for(Animal x:a) System.out.println(x);
    }
    public static void main(String[] args){
        List<Dog> d = Arrays.asList(new Dog("Rex"));
        print(d);
    }
}