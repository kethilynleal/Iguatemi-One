package testes;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import paginas.Metodos;
import paginas.Navegacoes;

import java.io.IOException;
import java.net.MalformedURLException;

public class Steps {

    Metodos metodos = new Metodos();
    Navegacoes nav = new Navegacoes();

    @Dado("que eu acesse o aplicativo")
    public void que_eu_acesse_o_aplicativo() throws MalformedURLException {
        metodos.abrirAplicativo("11.0", "com.iguatemi.one", "com.iguatemi.one.MainActivity", "Abro_o_aplicativo");
    }

    @Quando("insiro os dados para fazer o login")
    public void insiro_os_dados_para_fazer_o_login() throws IOException, InterruptedException {
        nav.loginApp("Faco_login_no_app");
    }

    @E("tiro evidencia")
    public void tiro_evidencia() throws IOException {
        metodos.capturarTela("Login_App");
    }

    @Entao("finalizo o teste")
    public void finalizo_o_teste() throws IOException {
        metodos.fecharAplicativo("Fecho_aplicativo_e_encerro_o_teste");
    }

}
