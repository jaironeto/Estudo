
class myClass {

    public static void main(String[] args) {

        Person extern = new Person();
        Person.Intern intern = extern.new Intern();
        intern.metodo();

        myInterface objInterface = new Person();
        objInterface.executar();
        objInterface.method();
        
    }

    public static void method(int... args){
        System.out.println(args[1]);
    }

};

interface myInterface{
    public void executar();
}
class Person implements myInterface{
    private String name1;
    private String name2;
    public String name3;
    public static String name4;
    public String name5;

    public void executar(){
        System.out.println("interface checked");
    }

    public Person(){
        this("jairo", "joice", "annaysa");
        
    }
    public Person(String name1, String name2, String name3){
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;

    }
    
    class Intern{
        public void metodo(){
            System.out.println(name1 + " intern");
        }
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