public class z{
  public static void main(String[] args) {
      In i = new In() {
          public void m() {
              System.out.println("Hello World!");
          }
      };

    In i2 = () -> System.out.println("Hello World!");
    i2.m();
  }
}
interface In{
  void m();
}