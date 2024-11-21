
class myClass {

    public static void main(String[] args) {
        method(11, 23, 34);
        int[] arraymy = new int[10];
        arraymy[0] = 3;
        
        System.out.println(arraymy[0]);

    }

    public static void method(int... args){
        System.out.println(args[1]);
    }

};

class Person{
    
}