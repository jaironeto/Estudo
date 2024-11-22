
class myClass {

    public static void main(String[] args) {
        Person obj = new Person();

        System.out.println(Person.name4);

        obj.method();

        System.out.println(obj.name5);
    }

    public static void method(int... args){
        System.out.println(args[1]);
    }

};

class Person{
    private String name1;
    private String name2;
    public String name3;
    public static String name4;
    public String name5;

    public Person(){
        this("jairo", "joice", "annaysa");
        
    }
    public Person(String name1, String name2, String name3){
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;

    }

    static {
        Person.name4 = "Gustavo";
    }

    {
        this.name5 = "vrummmmmmmm";
    }

    public void method(){
        System.out.println(this.name1 + " " + this.name2 + " " + this.name3);
    }
}