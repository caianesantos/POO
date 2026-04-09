/***
 * Implemente uma classe chamada ProgressaoAritmetica que possui três atributos
 * (primeiroTermo, razao, termoAtual) e um método chamado proximoTermo que
 * devolve o termo atual para quem chamou e calcula o próximo termo atualizando o
 * termoAtual. A classe deverá ter um método construtor que receba o valor do primeiro
 * termo e a razão e instancie o objeto com esses valores. Em seguida crie uma aplicação
 * que instancie um objeto da classe implementada, e mostre na tela os n primeiros
 * termos da progressão, sendo n definido pelo usuário. Em seguida a aplicação deve
 * reinicializar o objeto estabelecendo novos valores para o primeiro termo e a razão
 * (Deves ser usados os getters e setters para fazer isso).
 */

package progressaoAritmetica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProgressaoAritmetica pa = new ProgressaoAritmetica(5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de termos: ");
        int termo = sc.nextInt();

        for(int i = 1; i <= termo; i++) {
            System.out.println(pa.toString());
        }
        System.out.println("O termo atual é: " + pa.getPrimeiroTermo());
        System.out.println("A razão atual é: " + pa.getRazao());

        System.out.println("Digite o novo termo: ");
        int novoTermo = sc.nextInt();
        pa.setPrimeiroTermo(novoTermo);
        System.out.println("O novo termo é: " + pa.getPrimeiroTermo());

        System.out.println("Digite a nova razão: ");
        int novaRazao = sc.nextInt();
        pa.setRazao(novaRazao);
        System.out.println("A nova razão é: " + pa.getRazao());

    }
}