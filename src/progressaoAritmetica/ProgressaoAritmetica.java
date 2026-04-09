package progressaoAritmetica;

public class ProgressaoAritmetica {
    private int primeiroTermo;
    private int razao;
    private int termoAtual;

    public ProgressaoAritmetica(int termoAtual){
        this.primeiroTermo = 2;
        this.razao = 4;
        this.termoAtual = termoAtual;
    }
    public int proximoTermo(){
        int proximoTermo = this.termoAtual;
        termoAtual += this.razao;
        return this.termoAtual;
    }

    public int getPrimeiroTermo(){
        return this.primeiroTermo;
    }
    public int getRazao(){
        return this.razao;
    }

    public int setPrimeiroTermo(int termo){
        this.primeiroTermo = termo;
        return this.primeiroTermo;
    }

    public int setRazao(int razao){
        this.razao = razao;
        return this.razao;
    }

    public String toString(){
        return "1° termo: " + this.primeiroTermo + " razão: " + this.razao + " termo atual: " + proximoTermo();
    }
}
