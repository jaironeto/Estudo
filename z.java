class Pai implements interface1{

  class Inter{
    public void method(){
      System.out.println("Inter");
    }
  }

  private String name;

  public void method(){
    System.out.println("interface1");
  }

  public Pai(){
    this("jairo");
  }

  public Pai(String name){
    this.name = name;
  }
  public void method(int... a){
    System.out.println(a[0]);
  }
}
interface interface1{
  void method();
}

public class z{
  public static void main(String[] args){
    Pai p = new Pai();
    Pai.Inter i = p.new Inter();

    interface1 i1 = new Pai();

  }
}