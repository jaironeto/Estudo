
class Program {

    public static void main(String[] args) {

        final String name1 = "jairo";

        int[] array1 = new int[10];
        array1[0] = 2;

        int[] array2 = {20, 30, 44, 11};
        int[][] array3 = new int[20][10];
        int[][] array4 = {{23, 2}, {33, 2}};

        String name2 = "jairo" + " " + "marcos";

        switch (name1) {
            case "marcos":

                break;

            case "jairo":
                break;

            default:
                break;
        }

        for (int i : array2) {
            System.out.println(i);
        }
    }
}

class Pai {

}

class Filho extends Pai {

}

class Nada {

    private String name1;
    private String name2;
    public static String name3;

    static {
        Nada.name3 = "ionelle";
    }

    public Nada() {
        this.name1 = "jairo";
        this.name2 = "marcos";
    }

    public Nada(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    public void getMethod() {
        System.out.println(this.name1 + " " + this.name2);
    }

    public void getMethod(int i) {
        System.out.println(this.name1 + " " + this.name2 + "-" + i);
    }

    public void getMethod(int[] i) {
        System.out.println(i[0]);
    }

    public void getMethod(int a, int... i) {
        System.out.println(i[0]);
    }

    public Pai getClassMethod() {
        Pai obj = new Pai();
        return obj;
    }
}
