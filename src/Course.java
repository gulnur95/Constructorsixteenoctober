public class Course {


    String name;
    String instructor;
    Student[] students;


    public Course(String name, String instructor, Student[] students) {
        if(name.length()<=2){
            System.out.println("Группанын атын туура жаз ! ");
        }else {
            this.name = name;
        }
        this.instructor = instructor;
        this.students = students;
    }
}