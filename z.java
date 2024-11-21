
class myClass {

    public static void main(String[] args) {
        method(11, 23, 34);
        int[] arraymy = new int[10];
        arraymy[0] = 3;
        int[] arr1 = {10, 30, 22, 3, 6, 66};
        
        int[][] arr2 = {{1,3}, {5,4}};
        System.out.println(arr2[0][0]);

        Person obj = new Person("jairo", "marcos", "ionelle");
        obj.method();
        System.out.println(obj.name3);

        Person obj2 = method2();
        System.out.println(obj2.name3);
    }

    public static void method(int... args){
        System.out.println(args[1]);
    }

    public static Person method2(){
        Person obj = new Person("jairo", "marcos", "rodrigo");

        return obj;
    }

};

class Person{
    private String name1;
    private String name2;
    public String name3;

    public Person(String name1, String name2, String name3){
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
    }

    public void method(){
        System.out.println(this.name1 + " " + this.name2);
    }
}