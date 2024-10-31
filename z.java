
class automovel {

    public static int VALUESTATIC = 0;
    private String name;
    private String profissao;
    private int idade;

    {
      this.name = "marco2";
      this.profissao = "mecanico";
    }
    /*public automovel(){
      this("jairo", "programador", 666);
    }
    public automovel(String name, String profissao, int idade) {
        this.name = name;
        this.profissao = profissao;
        this.idade = idade;
    }*/

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
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

class z {

    public enum MyEnum {SEGUNDA, TERÇA, QUARTA};

    public static void main(String[] args) {
      automovel obj = new automovel();
        System.out.println(obj.getName());
    }
}

_