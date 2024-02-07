public class Main {
    public static void main(String[] args) {

        Gato g1 = new Gato(); // Instanciação de g1
        Gato g2 = new Gato();
        String vitima = "Rodrigo";
        g2.nome = "Maik Baguncinha";
        g1.nome = "Xandão";
        g1.cor = "Pálido";
        g1.idade = 200;
        g1.pedigree = true;
        g1.sexo = "Todo dia";
        g1.raca = "Vira lata";
        g1.arranhar("tobias");
        g1.arranhar(g2.nome);
    }
}
