class Filho {

    public static void main(String[] args) {
        int[] array1 = new int[10];
        array1[0] = 33;

        System.out.println(array1[0]);

        int array2[] = new int[10];

        int array3[] = {20, 33, 11, 55, 66};

        System.out.println(array3[1]);

        int[][] array4 = {{12, 33}, {33, 11}};

        System.out.println(array4[0][0]);

        String name = "jairo";

        switch (name) {
            case "marco":

                break;
            default:
                System.out.println("default");
                break;
        }

        for (int i : array3) {
            System.out.println(i);
        }

        Teste obj = new Teste(32, 4);

        System.out.println(obj.methodGet());
        System.out.println(obj.methodGet(3));
        System.out.println(obj.methodGet(array3));

        obj.methodSpreed(23, 22, 11);

        Teste obj2 = new Teste();
        System.out.println(obj2.methodGet());
        System.out.println(Teste.campStatic);

        Bike obj3 = new Bike();
        System.out.println(obj3.name1);

       Bike extern = new Bike();
       Bike.Intern intern = extern.new Intern();

    }
}

class Pai extends Filho {

    final int var1 = 32;

    public final void method() {

    }
}

class Bike {
    public String name1;
    public String name2;

    {
        this.name1 = "jairo";
        this.name2 = "marco";
    }

    class Intern{
        public String name3;
    }
}

final class Teste {

    private int camp1;
    private int camp2;
    public static int campStatic;

    public Teste() {
        this(22, 11);
    }

    public Teste(int camp1, int camp2) {
        this.camp1 = camp1;
        this.camp2 = camp2;
    }

    static{
        Teste.campStatic = 99;
    }

    public Bike methodClass() {
        Bike camp1 = new Bike();

        return camp1;
    }

    public void methodSpreed(int... i) {
        for (int a : i) {
            System.out.println(a);
        }
    }

    public String methodGet() {
        return this.camp1 + " " + this.camp2;
    }

    public String methodGet(int i) {
        return "sobrecarga 1";
    }

    public String methodGet(int i, int ii) {
        return "sobrecarga 2";
    }

    public String methodGet(int[] i) {
        return " " + i[0];
    }
}
