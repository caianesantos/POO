package imovel;

public class Novo extends Imovel{
    private double adicional;

    public Novo(String endereco, double preco, double adicional){
        super(endereco, preco);
        this.adicional = adicional;
    }
    public double getValorAdicional(){
        return this.adicional;
    }

    public String toString(){
        return "\nEndereço: " + this.getEndereco()
                + "\nPreço: " + this.getPreco()
                + "\nValor adicional: " + getValorAdicional();
    }
}
