public class City {

    /* Озунуз каалаган класс тузунуз Класска полелерин жазып 4 конструктор тузунуз
Ар бир конструктор аркылуу 4 башка объект тузуп, маанилерин сканнер аркылуу берип, консольго чыгарыныз */




    String name;
    String country;
    int population;
    String mayor;


    public City (String name, String country, int population, String mayor){
        this.name = name;
        this.country = country;
        this.population = population;
        this.mayor = mayor;
    }



    public City (String name, String country){
        this.name =name;
        this.country = country;
        this.population = 0;
        this.mayor = "Unknown";
    }

    public City (String name){
        this.name = name;
        this.country = "Unknown";
        this.population = 0;
        this.mayor = "Unknown";
    }

    public City (){
        this.name="Unknown";
        this.country="Unknown";
        this.population =0;
        this.mayor="Unknown";
    }

    public void displayInfo() {
        System.out.println("Шаардын аты: " + name);
        System.out.println("Өлкө: " + country);
        System.out.println("Калкы: " + population);
        System.out.println("Мэр: " + mayor);
        System.out.println("----------------------------");
    }













}
