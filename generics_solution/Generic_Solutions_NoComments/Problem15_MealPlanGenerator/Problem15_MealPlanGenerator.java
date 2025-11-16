interface MealPlan {}
class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}
class KetoMeal implements MealPlan {}
class Meal<T extends MealPlan> {
    private T p;
    public Meal(T p){this.p=p;}
}
public class MealPlanner {
    public static <T extends MealPlan> Meal<T> gen(T p){
        return new Meal<>(p);
    }
    public static void main(String[] args){
        gen(new VegetarianMeal());
    }
}