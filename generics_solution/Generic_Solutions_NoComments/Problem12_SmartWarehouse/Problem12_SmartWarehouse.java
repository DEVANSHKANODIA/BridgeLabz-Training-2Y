import java.util.*;
abstract class WarehouseItem { abstract String get(); }
class Electronics extends WarehouseItem { String n; Electronics(String n){this.n=n;} String get(){return n;} public String toString(){return n;} }
class Groceries extends WarehouseItem { String n; Groceries(String n){this.n=n;} String get(){return n;} public String toString(){return n;} }
public class Storage<T extends WarehouseItem> {
    private List<T> list = new ArrayList<>();
    public void add(T i){ list.add(i); }
    public List<T> getList(){ return list; }
    public static void showAll(List<? extends WarehouseItem> w){
        for(WarehouseItem x:w) System.out.println(x);
    }
    public static void main(String[] args){
        Storage<Electronics> s = new Storage<>();
        s.add(new Electronics("TV"));
        showAll(s.getList());
    }
}