package imovel;

public class Velho extends Imovel{
    private double desconto;

    public Velho(String endereco, double preco, double desconto){
        super(endereco, preco);
        this.desconto = desconto;
    }
    public double getValorDesconto(){
        return this.desconto;
    }

    public String toString(){
        return "\nEndereço: " + this.getEndereco()
                + "\nPreço: " + this.getPreco()
                + "\nValor do desconto: " + getValorDesconto();
    }
}
