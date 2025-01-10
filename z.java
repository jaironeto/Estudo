public class z{
    public static void main(String[] args){
        int[][] array1 = new int[3][4];

        Pai obj = new Pai("name1");
        obj.method1(array1);

        obj.method2(22,33,44,11);

        Extern obj3 = new Extern();
        Extern.Intern obj2 = obj3.new Intern();
        obj2.method();
    }
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