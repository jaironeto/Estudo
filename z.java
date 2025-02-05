
public class z {

    public static void main(String[] args) {
        In i = () -> {
            System.out.println("vrum");
            System.out.println("trum");
        };

        i.method();

      Class1 a = new Class1(){
        @Override
        void method(){
          System.out.println("class");
        }

        void method2(){
          System.out.println("c");
        }
      };
    }
}

interface In {

    void method(); 
}

class Class1{
  void method(){
    System.out.println("vrum");
  }
}