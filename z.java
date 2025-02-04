
public class z {

    public static void main(String[] args) {
        String name = "jairo";

        In i = new In(){
          @Override
          public void method(){
            System.out.println("vrum");
          }
        };

        switch (name) {
            case "jairo":
                break;

            default:
        }

        search:
        for (int a = 9; a < 10; a++) {
            for (int z = 9; z < 10; z++) {
                break search;
            }
        }

        In in1 = ()-> System.out.println("zzz");
    }
}

interface In{
  public void method();
}

class Class1{

  public Class1(){
    this("jairo");
  }

  public Class1(String i){

  }

  public void method(String i){

  }

  public void method(int i){

  }

  public void method(int i, int b){

  }

  public void method2(int... i){

  }

  public void method3(String[] i){

  }
}
