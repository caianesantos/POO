package imovel;

public class Imovel {
    private String endereco;
    private double preco;

    public Imovel(String endereco, double preco){
        this.endereco = endereco;
        this.preco = preco;
    }
    public String getEndereco(){
        return this.endereco;
    }

    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public String toString(){
        return "\nEndereço: " + this.endereco
                + "\nPreço: " + this.preco;
    }
}
