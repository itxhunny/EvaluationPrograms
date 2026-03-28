import java.util.*;

class Teacher{
    private String name;

    public Teacher(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
class Student{
    private String name;

    public Student(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
class ClassRoom{
    private Teacher teacher;
    private List<Student> students;

    public ClassRoom(Teacher teacher,List<Student> students){
        this.teacher=teacher;
        this.students=students;
    }
    public void getRoster(){
        System.out.println("Teacher: "+teacher.getName());
        System.out.println("Students:");
        for(Student s:students){
            System.out.println(s.getName());
        }
    }
}
 class Main{
    public static void main(String[] args){
        Teacher t=new Teacher("Sir Hamza");

        Student s1=new Student("Hanzala");
        Student s2=new Student("Ali");
        Student s3=new Student("Umer");
        Student s4=new Student("Ibrahim");

        List<Student> list=Arrays.asList(s1,s2,s3,s4);
        ClassRoom room=new ClassRoom(t,list);
        room.getRoster();
    }
}