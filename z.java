
class myClass {

    public static void main(String[] args) {

        int[] arr1 = new int[10];
        arr1[0] = 66;

        int[] arr2 = {123, 34, 66};
    }

    public static void method(int... args){
        System.out.println(args[1]);
    }

};

class Pai{

}
class Filho extends Pai{

}