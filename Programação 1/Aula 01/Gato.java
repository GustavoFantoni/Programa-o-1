public class Gato {
    // Atributos da classe

    public String nome;
    public String cor;
    public String raca;
    public String sexo;
    public boolean pedigree;
    public int idade;

    // Construtor

    public Gato() {  }


    // Métodos
    // Acesso | tipo de retorno | nome() {}

    public void arranhar(String nomeDaVitima) {
        System.out.println(nome + " está arranhando " + nomeDaVitima);
    }
    public void corre() {
        System.out.println(nome + " está correndo");
    }
    public void dorme() {
        System.out.println(nome + " está dormindo. Shhhhh");
    }
    public void ronronar() {
        System.out.println(nome + " está ronronando...");
    }

}
