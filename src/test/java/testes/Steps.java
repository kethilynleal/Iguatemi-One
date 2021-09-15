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

    @Quando("insiro os dados para fazer o login positivo")
    public void insiro_os_dados_para_fazer_o_login_positivo() throws IOException, InterruptedException {
        nav.loginAppPositivo("Faco_login_no_app_positivo");
    }

    @Quando("insiro os dados para fazer o login negativo")
    public void insiro_os_dados_para_fazer_o_login_negativo() throws IOException, InterruptedException {
        nav.loginAppNegativo("Faco_logins_no_app_negativos");
    }

    @Quando("faco novo cadastro")
    public void faco_novo_cadastro() throws IOException, InterruptedException {
        nav.facoNovoCadastro("faco_novo_cadastro");
    }

    @E("valido listagem de pontuacao e layout")
    public void valido_listagem_de_pontuacao_e_layout() throws IOException, InterruptedException {
        nav.validolistagemDePontuacaoeLayout("valido_listagem_de_pontuacao_de_membros");
    }

    @E("verifico notas fiscais lancadas e valido layout")
    public void verifico_notas_fiscais_lancadas_e_valido_layout() throws IOException, InterruptedException {
        nav.verificoNotasFiscaisLancadasEValidoLayout("verifico_notas_fiscais_lancadas");
    }

    @E("dados pessoais")
    public void dados_pessoais() throws IOException, InterruptedException {
        nav.verificoNotasFiscaisLancadasEValidoLayout("verifico_notas_fiscais_lancadas");
    }

    @E("insiro dados de contato")
    public void insiro_dados_de_contato() throws IOException, InterruptedException {
        nav.verificoNotasFiscaisLancadasEValidoLayout("verifico_notas_fiscais_lancadas");
        }

        @E("crio uma senha e aceito os termos")
        public void crio_uma_senha_e_aceito_os_termos() throws IOException, InterruptedException {
        nav.verificoNotasFiscaisLancadasEValidoLayout("verifico_notas_fiscais_lancadas");
        }

    @E("escolho shopping favorito")
    public void escolho_shopping_favorito() throws IOException, InterruptedException {
        nav.verificoNotasFiscaisLancadasEValidoLayout("verifico_notas_fiscais_lancadas");
    }

    @Entao("finalizo o teste")
    public void finalizo_o_teste() throws IOException {
        metodos.fecharAplicativo("Fecho_aplicativo_e_encerro_o_teste");
    }

}
