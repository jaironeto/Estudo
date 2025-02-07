public class z{
  public static void main(String[] args) {

      var anonima = new Class1(1){
        @Override
        public void method(int idade2){
          System.out.println(idade1);
        }
      };

      anonima.method(2);
  }
}

class Class1{
  public int idade1;

  public Class1(int idade1){
    this.idade1 = idade1;
  }

  public void method(int idade1){
    this.idade1 = idade1;
  }
}