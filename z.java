
class automovel {

    private String name;
    private String profissao;
    private int idade;

    public automovel(String name, String profissao, int idade) {
        this.name = name;
        this.profissao = profissao;
        this.idade = idade;
    }

    public String getName() {
        return this.name;
    }

    public String getName(String arg) {
        return this.name + arg;
    }

    public String getName(String arg1, String arg2) {
        return this.name + arg1 + arg2;
    }

    public String getProfissao() {
        return this.profissao;
    }
}

class z extends automovel {

    public String argZ;
    public z() {
        super("jairo", "programador", 24);
        this.argZ = "carro";
    }

    public static void main(String[] args) {
       z obj = new z();
       System.out.println(obj.getName());
       System.out.println(obj.argZ);

    }

    public static void chamar(int... arg1) {
      System.out.println(arg1[1]);
    }
}