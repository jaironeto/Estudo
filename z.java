public class z{
    public static void main(String[] args) {
        Extern ex = new Extern();
        Extern.Intern in = ex.new Intern();
        in.method();
    }
}

class Extern{
    class Intern{
        public void method(){
            System.out.println("class intern");
        }
    }
}
class Class2{
    public String campo1;
}

class Class1{
    public Class2 method(){
        Class2 obj = new Class2();
        return obj;
    }
}