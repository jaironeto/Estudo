public class z{
  public static void main(String[] args){
    int[] array1 = {1,3,4,5,6};

    for(int i : array1){
      System.out.println(i);
    }

    inter in = new inter(){
      public void method(){
        System.out.println("teste");
      }
    };

    inter in1 = () -> System.out.println("vrum");

    in1.method();
  }

  public static void Method1(int... i){}
}

interface inter{
  public void method();
}