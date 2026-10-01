package hospedagem;

public class PlanoBasico implements Plano{

    public float preco;

    public PlanoBasico(){

    }

    public PlanoBasico(float preco){
        this.preco = preco;

    }

    public float getPreco(){
        return preco;
    }

    public String getDescricao() {
        return "Básico";
    }
}
