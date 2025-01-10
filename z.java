public class z{
    public static void main(String[] args){
        int[][] array1 = new int[3][4];

        Pai obj = new Pai();
        obj.method1(array1);
    }
}

class Pai{
    public void method1(int[][] a){
        a[0][0] = 9;
        System.out.println(a[0][0]);
    }
}