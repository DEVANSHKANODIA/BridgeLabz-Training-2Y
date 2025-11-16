class Product<T> {
    private String n;
    private double p;
    private T c;
    public Product(String n,double p,T c){this.n=n;this.p=p;this.c=c;}
    public double get(){return p;}
    public void disc(double d){ p = p * (1 - d/100); }
    public String toString(){return n+" "+p;}
}
public class Marketplace {
    public static <T extends Product<?>> void apply(T pr,double d){
        pr.disc(d);
    }
    public static void main(String[] args){
        Product<String> b = new Product<>("Book",50,"Cat");
        System.out.println(b);
        apply(b,10);
        System.out.println(b);
    }
}