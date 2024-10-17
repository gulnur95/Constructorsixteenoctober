public class Student {


    String name;
    int age;
    int typing;


    public Student(String name, int age, int typing){
        this.name = name;
        if(age<16){
            System.out.println(name + "Окууга мумкунчулугу жок ! ");
            this.age = 0;
        }else {
        this.age = age;
        }
        this.typing = typing;
    }
}
