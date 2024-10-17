import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        //  Task  LMS  Constructor

        String[] lessons ={"Java", "English", "Soft skilss"};
        MyClass myClass = new MyClass("Gulnur", "Asanalieva", 29, lessons, "Fish");
        MyClass myClass1= new MyClass("Jason", 25, "Pasta");
        System.out.println("Объекттердин маалыматтары:");
        myClass.displayInfo();
        myClass1.displayInfo();





        //  Variant 2
//        String[] lessons ={"Java", "English", "Soft skilss"};
//
//        MyClass myClass = new MyClass("Gulnur", "Asanalieva", 29, lessons, "Fish");
//        MyClass myClass1= new MyClass("Jason", 25, "Pizza");
//        System.out.print("\nName: " + myClass.firstName + "     Lastname: " + myClass.lastName +
//                "    Age: " + myClass.age   + "    Food: " + myClass.food + "    Lessons: ");
//        for(String subjects: lessons){
//            System.out.print(subjects + "  ");
//        }
//        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        System.out.print("Name: " + myClass1.firstName+ "    lastName: " + myClass1.lastName +
//                "     Age:" + myClass1.age +  "     Food: " + myClass1.food+ "     Lessons: ");
//        for (String subjects : myClass1.lessons){
//            System.out.println( subjects);
//        };








        /*  Task3  Constructor
        Озунуз каалаган класс тузунуз. Класска полелерин жазып 4 конструктор тузунуз
        Ар бир конструктор аркылуу 4 башка объект тузуп, маанилерин сканнер аркылуу берип, консольго чыгарыныз */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("1-шаар үчүн маалыматтарды киргизиңиз: ");
//        System.out.print("City name: " );
//        String name1 = scanner.nextLine();
//        System.out.print("Country name: ");
//        String country1 = scanner.nextLine();
//        System.out.print("Population: " );
//        int population1 = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Mayor: " );
//        String mayor1 = scanner.nextLine();
//         City city1 = new City(name1, country1, population1, mayor1);
//
////        System.out.println("Name: " + city1.name  + "    Country: " + city1.country  +
////                "    Population: " + city1.population  +  "    Mayor: "+ city1.mayor);
//
//
//
//        System.out.println("\n2-шаар үчүн маалыматтарды киргизиңиз:  " );
//        System.out.print("City name: ");
//        String name2 = scanner.nextLine();
//        System.out.print("Country name: ");
//        String country2 = scanner.nextLine();
//        City city2 = new City (name2, country2);
//
////        System.out.println("City name :  " + city2.name + "   Country name: " + city2.country);
//
//
//
//        System.out.println("\n3-шаар үчүн маалыматтарды киргизиңиз: ");
//        System.out.print("City name: ");
//        String name3 = scanner.nextLine();
//        City city3 = new City(name3);
//
////        System.out.println("City name:  " + city3.name);
//
//
//
//        System.out.println("\n4-шаар үчүн маалыматтарды киргизиңиз: ");
//          City city4 = new City();
//
////        System.out.println("city name: " + city4.name + "    Country name: " + city4.country+
////             "     Mayor:" + city4.mayor +  "    Population: " + city4.population );
//
//
//        System.out.println("\nШаарлардын маалыматтары:");
//        city1.displayInfo();
//        city2.displayInfo();
//        city3.displayInfo();
//        city4.displayInfo();







//       Task 2 Constructor
//       Student student1 = new Student("Joe ", 18, 30);
//        Student student2 = new Student("John ", 15, 33);
//        Student student3 = new Student("James ", 19, 33);
//
//        Student [] students = {student1, student2, student3};
//
//        Course course = new Course("Java", "Aijamal", students);
//
//        System.out.println(course.name);
//        System.out.println(course.instructor);
//        for(Student student: course.students){
//            System.out.println("Student's Name: " + student.name + "\n Age: " +
//                     student.age + "\n Typing: " + student.typing);
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        }






//           Task 1 Constructor
//        Cat cat = new Cat("Garfild", "grey", 2);
//        Cat cat1 = new Cat("Mia", "brown", 1);
//
//
//        Dog dog1 = new Dog("Hatiko", "grey", 4);
//        Dog dog2 = new Dog("Shy", "black", 2);
//
//        System.out.println("~~~~~~~~~Cat~~~~~~~~~~");
//        System.out.println(cat.name + "\n" + cat.color + "\n" + cat.age);
//        System.out.println("~~~~~~~~~Cat1~~~~~~~~~~");
//        System.out.println(cat1.name + "\n" + cat1.color + "\n" + cat1.age);
//        System.out.println("~~~~~~~~~~Dog1~~~~~~~~~~");
//        System.out.println(dog1.name + "\n" + dog1.color + "\n" + dog1.age);
//        System.out.println("~~~~~~~~~~~Dog2~~~~~~~~~~");
//        System.out.println(dog2.name + "\n" + dog2.color + "\n" + dog2.age);
//


    }
}