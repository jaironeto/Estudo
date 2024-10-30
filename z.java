
class automovel {

}

class z extends automovel {

    public static void main(String[] args) {
        int[] myarray = {100, 3000, 200, 10, 20, 30, 10};

        labelName:
        for (int value : myarray) {
            System.out.println("valor: " + value);
            for (int value2 : myarray) {
                System.out.println("valor2: " + value2);

                if (value2 == 200) {
                    break labelName;
                }
            }
        }
    }
}
