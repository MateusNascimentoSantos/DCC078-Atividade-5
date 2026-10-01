package hospedagem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoTest {

    @Test
    void deveRetornarPrecoPlano() {
        Plano plano = new PlanoBasico(2000.0f);

        assertEquals(2000.0f, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoPlanoComBackup() {
        Plano plano = new Backup(new PlanoBasico(2000.0f));

        assertEquals(2300.0f, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoPlanoComSuporteDedicado() {
        Plano plano = new SuporteDedicado(new PlanoBasico(2000.0f));

        assertEquals(2400.0f, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoPlanoComCertificadoSSL() {
        Plano plano = new CertificadoSSL(new PlanoBasico(2000.0f));

        assertEquals(2100.0f, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoPlanoComBackupMaisSuporteDedicado() {
        Plano plano = new Backup(new SuporteDedicado(new PlanoBasico(2000.0f)));

        assertEquals(2760.0f, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoPlanoComBackupMaisCertificadoSSL() {
        Plano plano = new Backup(new CertificadoSSL(new PlanoBasico(2000.0f)));

        assertEquals(2415.0f, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoPlanoComSuporteDedicadoMaisCertificadoSSL() {
        Plano plano = new SuporteDedicado(new CertificadoSSL(new PlanoBasico(2000.0f)));

        assertEquals(2520.0f, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoPlanoComBackupMaisSuporteDedicadoMaisCertificadoSSL() {
        Plano plano = new Backup(new SuporteDedicado(new CertificadoSSL(new PlanoBasico(2000.0f))));

        assertEquals(2898.0f, plano.getPreco());
    }

    @Test
    void deveRetornarDescricaoPlano() {
        Plano plano = new PlanoBasico();

        assertEquals("Básico", plano.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPlanoComBackup() {
        Plano plano = new Backup(new PlanoBasico());

        assertEquals("Básico/Backup", plano.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPlanoComSuporteDedicado() {
        Plano plano = new SuporteDedicado(new PlanoBasico());

        assertEquals("Básico/Suporte", plano.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPlanoComCertificadoSSL() {
        Plano plano = new CertificadoSSL(new PlanoBasico());

        assertEquals("Básico/SSL", plano.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPlanoComBackupMaisSuporteDedicado() {
        Plano plano = new Backup(new SuporteDedicado (new PlanoBasico()));

        assertEquals("Básico/Suporte/Backup", plano.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPlanoComBackupMaisCertificadoSSL() {
        Plano plano = new Backup(new CertificadoSSL (new PlanoBasico()));

        assertEquals("Básico/SSL/Backup", plano.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPlanoComSuporteDedicadoMaisCertificadoSSL() {
        Plano plano = new SuporteDedicado(new CertificadoSSL (new PlanoBasico()));

        assertEquals("Básico/SSL/Suporte", plano.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPlanoComBackupMaisSuporteDedicadoMaisCertificadoSSL() {
        Plano plano = new Backup (new SuporteDedicado(new CertificadoSSL (new PlanoBasico())));

        assertEquals("Básico/SSL/Suporte/Backup", plano.getDescricao());
    }

}