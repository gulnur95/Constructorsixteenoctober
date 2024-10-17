import java.util.Arrays;

public class MyClass {


    //  Task  LMS  Constructor

    String firstName;
    String lastName;
    int age;
    String[] lessons;
    String food;



    public MyClass (String firstName, String lastName, int age, String[]lessons, String food){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.lessons=lessons;
        this.food=food;

    }

    public MyClass(String firstName, int age, String food) {
        this.firstName = firstName;
        this.age = age;
        this.food = food;
    }

    public void displayInfo() {
        System.out.println("Аты: " + firstName);
        System.out.println("Фамилиясы: " + lastName);
        System.out.println("Жашы: " + age);
        System.out.println("Катышкан сабактар: " + Arrays.toString(lessons));
        System.out.println("Жакшы көргөн тамагы: " + food);
        System.out.println("----------------------------");
    }









//    Variant 2
//    String firstName;
//    String lastName;
//    int age;
//    String[] lessons;
//    String food;
//
//
//
//    public MyClass (String firstName, String lastName, int age, String[]lessons, String food){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.lessons=lessons;
//        this.food=food;
//
//    }
//
//    public MyClass(String firstName, int age, String food) {
//        this.firstName = firstName;
//        this.lastName = "Unknown";
//        this.age = age;
//        this.lessons = new String[]{"None"};
//        this.food = food;
//    }
//


















}
