import java.util.*;
class Course {
    private String courseName;
    private int creditHours;

    public Course(String courseName,int creditHours){
        this.courseName=courseName;
        this.creditHours=creditHours;
    }
    
    public String getCourseName(){ return courseName; }
    public int getCreditHours(){ return creditHours; }
}
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name,List<Course> courses){
        this.name=name;
        this.courses=courses;
    }

    public List<Course> getCourses(){
        return courses;
    }

    public void displayCourses(){
        System.out.println("Student: "+name);
        for(Course c:courses){
            System.out.println(c.getCourseName()+" ("+c.getCreditHours()+" CH)");
        }
    }
}
class Main {
    public static void main(String[] args){
        Course c1=new Course("OOP",3);
        Course c2=new Course("Computing",4);

        List<Course> list=Arrays.asList(c1,c2);

        Student s=new Student("Hanzala",list);

        s.displayCourses();
    }
}