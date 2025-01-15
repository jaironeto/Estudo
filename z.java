public class z{
  public static void main(String[] args){
    int[] array1 = new int[10];
    int[] array2 = {20,33,22,33};
    int[][] array3 = new int[3][2];
    int[][] array4 = {{33,22,1}, {35,4}};

    Class1 obj = new Class1("vrum");
    obj.method(array2);
  }
}

class Class1{
  private String name;
  public Class1(String name){
    this.name = name;
  }

  public void method(){
    System.out.println("method");
  }

  public void method(int i){
    System.out.println("method" + i);
  }
  
  public void method(int[] i){
    for(int a : i){
      System.out.println("method for" + a );
    }
  }
}