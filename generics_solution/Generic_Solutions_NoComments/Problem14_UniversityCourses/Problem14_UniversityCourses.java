import java.util.*;
abstract class CourseType {}
class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}
class ResearchCourse extends CourseType {}
public class University {
    public static void print(List<? extends CourseType> c){
        for(CourseType x:c) System.out.println(x.getClass().getSimpleName());
    }
    public static void main(String[] args){
        List<CourseType> l = Arrays.asList(new ExamCourse(), new ResearchCourse());
        print(l);
    }
}