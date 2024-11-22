
class myClass {

    public static void main(String[] args) {

        int[] arr1 = new int[10];
        arr1[0] = 66;

        int[] arr2 = {123, 34, 66};

        int[][] arr3 = new int[10][3];
        arr3[0][0] = 6;

        System.out.println(arr3[0][0]);

        int[][] arr4 = {{2,3}, {55, 65}};

        for(int i : arr2){
            System.out.println(i);
        }
    }

    public static void method(int... args){
        System.out.println(args[1]);
    }

};

class Pai{
    public String name1;
    private String name2;

    public Pai(){
        this.name1 = "name1";
        this.name2 = "names2";
    }
    
    public void method(){

    }

    public void method(int i){

    }

    public 

}
class Filho extends Pai{
    public Filho(){
        super();
    }
}