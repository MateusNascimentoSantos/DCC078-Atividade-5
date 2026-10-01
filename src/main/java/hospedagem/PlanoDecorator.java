package hospedagem;

public abstract class PlanoDecorator implements Plano {
    private Plano plano;

    public PlanoDecorator(Plano plano) {
        this.plano = plano;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public abstract float getPercentualPreco();

    public float getPreco() {
        return this.plano.getPreco() * (1 + (this.getPercentualPreco() / 100));
    }

    public abstract String getNomeServico();

    public String getDescricao() {
        return this.plano.getDescricao() + "/" + this.getNomeServico();
    }
}
