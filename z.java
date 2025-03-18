
public class z {

    public static String name;

    static {
        name = "z";
    }

    public static void main() {
        int[] carro = {122, 222, 33, 44};

        Inter i = new Inter(){
          @Override
            public int method(){
                return 66;
            }
        };

        System.out.println(i.method());

        Inter i2 = () -> 343;

        Inter i3 = () -> {
          return 2222;
        };
    }

    

    public static void method(int... spread) {

    }
}

interface Inter{
  int method();
}

interface Inter2{
  
  default void method()
  {
    System.out.println("default method");
  }
}