package hospedagem;

public class Backup extends PlanoDecorator{

    public Backup(Plano plano) {
        super(plano);
    }

    public float getPercentualPreco() {
        return 15.0f;
    }

    public String getNomeServico() {
        return "Backup";
    }
}
