package hospedagem;

public class CertificadoSSL extends PlanoDecorator {

    public CertificadoSSL(Plano plano) {
        super(plano);
    }

    public float getPercentualPreco() {
        return 5.0f;
    }

    public String getNomeServico() {
        return "SSL";
    }}