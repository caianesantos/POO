/***
 * HERANÇA
 *
 * Crie a classe Imovel, que possui um endereço e um preço.
 * a. crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie métodos de
 * acesso e impressão deste valor adicional.
 * b. crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie métodos de
 * acesso e impressão para este desconto.
 */

package imovel;

public class Main {
    public static void main(String[] args) {
        Imovel imovel = new Imovel("rua tal", 59.99);
        Novo novo = new Novo("rua bla", 59.99, 79.90);
        Velho velho = new Velho("rua oi", 59.99, 22.35);

        System.out.println("Informações sobre o imóvel: " + imovel);
        System.out.println("\nInformações sobre o imóvel novo: " + novo);
        System.out.println("\nInformações sobre o imóvel velho: " + velho);
    }
}
