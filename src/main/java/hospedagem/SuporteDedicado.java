package hospedagem;

public class SuporteDedicado extends PlanoDecorator {

    public SuporteDedicado(Plano plano) {
        super(plano);
    }

    public float getPercentualPreco() {
        return 20.0f;
    }

    public String getNomeServico() {
        return "Suporte";
    }
}
