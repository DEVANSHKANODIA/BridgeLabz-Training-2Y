import java.util.*;
class Electronics { String n; Electronics(String n){this.n=n;} public String toString(){return n;} }
class Clothing { String n; Clothing(String n){this.n=n;} public String toString(){return n;} }
public class Cart<T> {
    private List<T> list = new ArrayList<>();
    public void add(T i){ list.add(i); }
    public void show(){ for(T x:list) System.out.println(x); }
    public static void main(String[] args){
        Cart<Electronics> c = new Cart<>();
        c.add(new Electronics("Phone"));
        c.show();
    }
}