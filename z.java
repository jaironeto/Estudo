class Pai{

    public void method(int[] a){
        System.out.println(a[0]);
    }

    public void method2(int... a){
        System.out.println(a[0]);
    }
}

class class2{
    
    class Intern{
        public void method(){
            System.out.println("Intern");
        }
    }
}
class class1{
    private int a;
    private int b;

    public class1(){
        this(33, 22);
    }

    public class1(int a, int b){
        this.a = a;
        this.b = b;
    }
}

interface inter{
    public void method();
}

public class z{
    public static void main(String[] args){
        Pai p = new Pai();
        int[] a = {1,2,3};
        p.method(a);

        p.method2(22, 33, 11);
        
        class2 obj = new class2();
        class2.Intern i = obj.new Intern();

        inter in = new inter(){
            public void method(){
                System.out.println("intern");
            }
        };

        in.method();
    }
}