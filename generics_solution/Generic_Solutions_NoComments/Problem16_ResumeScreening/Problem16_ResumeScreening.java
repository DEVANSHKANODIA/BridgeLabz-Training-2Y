abstract class JobRole {}
class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}
class Resume<T extends JobRole> {
    private String n;
    private T r;
    public Resume(String n,T r){this.n=n;this.r=r;}
    public String toString(){return n;}
}
public class ResumeProcessor {
    public static void main(String[] args){
        Resume<SoftwareEngineer> x = new Resume<>("A",new SoftwareEngineer());
        System.out.println(x);
    }
}