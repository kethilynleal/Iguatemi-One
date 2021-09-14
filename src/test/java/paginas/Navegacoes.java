package paginas;


import elementos.ElementosApp;

import java.io.IOException;


public class Navegacoes {

    Metodos metodos = new Metodos();
    ElementosApp el = new ElementosApp();


    public void loginAppPositivo(String descricaoPasso) throws IOException, InterruptedException {

        metodos.esperarElemento(el.getTelaInicialDois(),"Espero_elemento_ficar_clicavel");
        metodos.toqueDesliza(850,500,200,500,"toco_e_deslizo");
        metodos.esperarElemento(el.getTelaInicialDois(),"Espero_elemento_ficar_clicavel");
        metodos.toqueDesliza(850,500,200,500,"toco_e_deslizo");
        metodos.esperarElemento(el.getBotaoComecar(),"Espero_elemento_ficar_clicavel");
        metodos.toque(el.getBotaoComecar(), "Clico_no_botao_comecar");
        metodos.esperarElemento(el.getInserirEmail(),"Espero_elemento_ficar_clicavel");
        metodos.escrever(el.getInserirEmail(), "kelay29111@mi166.com", "Escrevo_usuario");
        metodos.escrever(el.getInserirSenha(), "Mudar@321", "Escrevo_senha");
        metodos.toque(el.getBotaoEntrar(), "Clico_no_botao_entrar");
        metodos.esperarElemento(el.getPemitirLocalizacao(),"Espero_permissao_de_localizacao");
        metodos.toque(el.getPemitirLocalizacao(),"Clico_em_permitir");
        metodos.esperarElemento(el.getValidarLogin(),"Espero_elemento_ficar_clicavel");
        metodos.pausa(1000,"Espero_meio_segundo");
        metodos.capturarTelaLogins("01_Login_App_positivo");
        metodos.validarTexto(el.getValidarLogin(),"Kelay Mi","Valido_texto");
    }

    public void loginAppNegativo(String descricaoPasso) throws IOException, InterruptedException {

        metodos.esperarElemento(el.getTelaInicial(),"Espero_elemento_ficar_clicavel");
        metodos.toqueDesliza(850,500,200,500,"toco_e_deslizo");
        metodos.esperarElemento(el.getTelaInicialDois(),"Espero_elemento_ficar_clicavel");
        metodos.toqueDesliza(850,500,200,500,"toco_e_deslizo");
        metodos.esperarElemento(el.getBotaoComecar(),"Espero_elemento_ficar_clicavel");
        metodos.toque(el.getBotaoComecar(), "Clico_no_botao_comecar");
        metodos.esperarElemento(el.getInserirEmail(),"Espero_elemento_ficar_clicavel");
        metodos.escrever(el.getInserirEmail(), "kelay29111@mi166.com", "Escrevo_usuario");
        metodos.escrever(el.getInserirSenha(), "", "Escrevo_senha");
        metodos.toque(el.getBotaoEntrar(), "Clico_no_botao_entrar");
        metodos.esperarElemento(el.getLoginSemSenha(),"Espero_elemento_ficar_clicavel");
        metodos.pausa(1000,"Espero_meio_segundo");
        metodos.capturarTelaLogins("02_Login_App_negativo_sem_senha");
        metodos.validarTexto(el.getLoginSemSenha(),"Senha deve conter pelo menos 6 dígitos","Valido_texto");
        metodos.esperarElemento(el.getLoginSemSenha(),"Espero_elemento_ficar_clicavel");
        metodos.limparTexto(el.getInserirEmail(),  "Limpo_o_texto");
        metodos.escrever(el.getInserirSenha(), "Mudar@321", "Escrevo_senha");
        metodos.toque(el.getBotaoEntrar(), "Clico_no_botao_entrar");
        metodos.esperarElemento(el.getLoginSemEmail(),"Espero_elemento_ficar_clicavel");
        metodos.pausa(1000,"Espero_meio_segundo");
        metodos.capturarTelaLogins("03_Login_App_negativo_sem_email");
        metodos.validarTexto(el.getLoginSemEmail(),"E-mail obrigatório","Valido_texto");
    }

    public void validolistagemDePontuacaoeLayout(String descricaoPasso) throws IOException, InterruptedException {

        metodos.toque(el.getMeusPontos(),"Clico_na_pontuacao_do_holder");
        metodos.pausa(2000,"Espero_dois_minutos");
        metodos.capturarTelaPontuacao("01_Listagem_pontuacao_do_holder");
        metodos.esperarElemento(el.getCliqueNoMembroDoPlanoFamilia(),"Espero_elemento_ficar_clicavel");
        metodos.toque(el.getCliqueNoMembroDoPlanoFamilia(),"Clico_no_membro_do_plano_familia");
        metodos.pausa(1000,"Espero_meio_segundo");
        metodos.capturarTelaPontuacao("02_Pontuação_de_membros_do_plano_familia");

    }

    public void verificoNotasFiscaisLancadasEValidoLayout(String descricaoPasso) throws IOException, InterruptedException {

        metodos.toque(el.getBotaoNotaFiscal(), "Clico_no_botao_nota_fiscal");
        metodos.esperarElemento(el.getConsultarNotaFiscal(),"Espero_elemento_ficar_clicavel");
        metodos.toque(el.getConsultarNotaFiscal(), "Clico_no_botao_para_consultar_notas_ficais");
        metodos.pausa(3000,"Espero_cinco_segundos");
        metodos.toque(el.getPendentes(), "Clico_nas_notas_pendentes");
        metodos.toque(el.getReprovadas(), "Clico_nas_notas_reprovadas");
        metodos.toque(el.getAprovadas(),"Verfico_notas_aprovadas");
        metodos.pausa(1000,"Espero_meio_segundo");
        metodos.capturarTelaDeNotasFiscais("01_Captura_de_tela_de_Notas_fiscais");
        metodos.validarTexto(el.getValidarTextoNotasFiscais(),"Notas Fiscais","Valido_texto");

    }
}
