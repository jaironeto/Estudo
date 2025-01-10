public class z{
    public static void main(String[] args){
        int[][] array1 = new int[3][4];

        Pai obj = new Pai("name1");
        obj.method1(array1);

        obj.method2(22,33,44,11);

        Extern obj3 = new Extern();
        Extern.Intern obj2 = obj3.new Intern();
        obj2.method();

        Inter obj4 = new Class2(); 
        System.out.println(obj4.executar());

        Inter obj5 = new Inter(){
            @Override
            public String executar(){
                return "executar anonimo 2222";
            }
        };
    
        System.out.println(obj5.executar());

        Day day = Day.SEGUNDA;
        System.out.println(day);
        day = day.TERÇA;
        System.out.println(day);

        Inter obj6 = () -> "executar labda";
        
        System.out.println(obj6.executar());
        
        switch(day){
            case SEGUNDA -> System.out.println("1");
            case TERÇA -> System.out.println("2");
    }
} 

enum Day{
    SEGUNDA, TERÇA, QUARTA;
}

interface Inter{
    String executar();
}

class Pai{
    private String name1;

    public Pai(String name1){
        this.name1 = name1;
    }
    public void method1(int[][] a){
        a[0][0] = 9;
        System.out.println(a[0][0]);
    }

    public void method2(int... a){
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}

class Filho extends Pai{
    private String name1;
    private String name2;
    private String name3;

    public Filho(){
        this("jairo", "alves", "vieira");
    }

    public Filho(String name1, String name2, String name3){
        super(name1);
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
    }
}

class Extern{
    class  Intern{
        public void method(){
            System.out.println("Intern");
        }
    }
}

class Class2 implements Inter{
    public String name1;

    {
        this.name1 = "jairo";
    }

    public String executar(){
        return "executar" + this.name1;
    }
}

interface Car1{
    default void print(){
        System.out.println("Car1");
    }
}

interface Car2{
    default void print(){
        System.out.println("Car2");
    }
}

class Car implements Car1, Car2{
    public void print(){
        Car1.super.print();
        Car2.super.print();
    }
}