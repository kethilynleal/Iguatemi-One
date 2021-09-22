package paginas;


import elementos.ElementosApp;

import java.io.IOException;


public class Navegacoes {

    Metodos metodos = new Metodos();
    ElementosApp el = new ElementosApp();


    public void loginAppPositivo(String descricaoPasso) throws IOException, InterruptedException {

        metodos.esperarElemento(el.getTelaInicial(),"Espero_elemento_ficar_clicavel");
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
        metodos.pausa(5000,"Espero_dois_minutos");
        metodos.capturarTelaPontuacao("01_Listagem_pontuacao_do_holder");
        metodos.esperarElemento(el.getCliqueNoMembroDoPlanoFamilia(),"Espero_elemento_ficar_clicavel");
        metodos.toque(el.getCliqueNoMembroDoPlanoFamilia(),"Clico_no_membro_do_plano_familia");
        metodos.pausa(5000,"Espero_meio_segundo");
        metodos.capturarTelaPontuacao("02_Pontuação_de_membros_do_plano_familia");
        metodos.validarTexto(el.getValidarTextoPlanoFamilia(),"Plano Família: Kethilyn","Valido_texto_de_plano_familia");

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

    public void novoCadastro(String descricaoPasso)  throws  IOException, InterruptedException {

        metodos.esperarElemento(el.getTelaInicial(), "Espero_elemento_ficar_clicavel");
        metodos.toqueDesliza(850, 500, 200, 500, "toco_e_deslizo");
        metodos.esperarElemento(el.getTelaInicialDois(), "Espero_elemento_ficar_clicavel");
        metodos.toqueDesliza(850, 500, 200, 500, "toco_e_deslizo");
        metodos.esperarElemento(el.getBotaoComecar(), "Espero_elemento_ficar_clicavel");
        metodos.toque(el.getBotaoComecar(), "Clico_no_botao_comecar");
        metodos.esperarElemento(el.getFazerCadastro(), "Espero_elemento_ficar_clicavel");
        metodos.toque(el.getFazerCadastro(), "Clico_em_faca_seu_cadastro");
        metodos.esperarElemento(el.getNome(), "Espero_elemento_ficar_clicavel");
        metodos.toque(el.getNome(),"Toco_no_elemento");
        metodos.esconderTeclado("Escondo_teclado");
        metodos.escrever(el.getNome(), "Teste", "Escrevo_nome");
        metodos.esperarElemento(el.getSobreNome(), "Espero_elemento_ficar_clicavel");
        metodos.escrever(el.getSobreNome(), "Testes", "Escrevo_sobrenome");
        metodos.esperarElemento(el.getClicoEmGenero(), "Espero_elemento_ficar_clicavel");
        metodos.toque(el.getClicoEmGenero(), "Clico_na_opcao_genero");
        metodos.esperarElemento(el.getEscolhoGeneroFeminino(), "Espero_elemento_ficar_clicavel");
        metodos.toque(el.getEscolhoGeneroFeminino(), "Escolho_sexo_feminino");
        metodos.esperarElemento(el.getClicoEmCpf(), "Espero_elemento_ficar_clicavel");
        metodos.toque(el.getClicoEmCpf(), "Clico_na_opcao_cpf");
        metodos.esconderTeclado("Escondo_teclado");
        metodos.escrever(el.getCpf(), "08823432200", "Insiro_o_cpf");
        metodos.esperarElemento(el.getClicoNaDataDeNascimento(), "Espero_elemento");
        metodos.toque(el.getClicoNaDataDeNascimento(), "Clico_na_data_de_nascimento");
        metodos.esperarElemento(el.getBotaoOkDataDeNascimento(), "Espero_elemento");
        metodos.toque(el.getBotaoOkDataDeNascimento(), "Clico_no_botao_ok_na_data_de_nascimento");
        metodos.esperarElemento(el.getPrimeiraSeta(), "Espero_elemento_ficar_clicavel");
        metodos.toque(el.getPrimeiraSeta(), "Clico_na_seta_para_prosseguir");
        metodos.esperarElemento(el.getNovoEmail(), "Espero_elemento_ficar_clicavel");
        metodos.toque(el.getNovoEmail(), "Clico_em_criar_novo_email");
        metodos.esconderTeclado("Escondo_teclado");
        metodos.escrever(el.getNovoEmail(), "testedoteste2@ddteste.com", "Insiro_novo_email");
        metodos.esperarElemento(el.getNovoEmail(), "Espero_elemento_ficar_clicavel");
        metodos.toque(el.getTelefone(), "Clico_em_criar_telefone");
        metodos.esconderTeclado("Escondo_teclado");
        metodos.escrever(el.getTelefone(), "11974582136", "Insiro_numero_de_telefone");
        metodos.esperarElemento(el.getSegundaSeta(), "Espero_elemento_ficar_clicavel");
        metodos.toque(el.getSegundaSeta(), "Clico_na_seta_para_prosseguir");
        metodos.esperarElemento(el.getCriarSenha(), "Espero_elemento_ficar_clicavel");
        metodos.toque(el.getCriarSenha(), "Clico_em_criar_senha");
        metodos.esconderTeclado("Escondo_teclado");
        metodos.escrever(el.getCriarSenha(), "Mudar@321", "Crio_nova_senha");
        metodos.esperarElemento(el.getAceitoEnvioDePromocoesENovidadesPorNotificacao(), "Espero_elemento_ficar_clicavel");
        metodos.toqueCoordenadasDuplo(106,924,"Aceito_envio_de_Novidades_e_Pomocoes_por_email");
        metodos.toque(el.getAceitoEnvioDePromocoesENovidadesPorNotificacao(), "Aceito_envio_de_Novidades_e_Pomocoes_por_notificacao");
        metodos.toque(el.getAceitoEnvioDePromocoesENovidadesPorSms(), "Aceito_envio_de_Novidades_e_Pomocoes_por_SMS");
        metodos.toque(el.getAceiteDeRegulamento(), "Aceito_politica_do_Iguatemi_one");
        metodos.toque(el.getAceiteDePolitica(), "Aceito_termos_de_politica_de_uso_de_dados");

    }
        public void escolhoShoppingFavorito(String descricaoPasso)  throws  IOException, InterruptedException {

            metodos.pausa(2000, "Espero_dois_sugundos");
            metodos.toqueDesliza(486, 500, 598, 500, "toco_e_deslizo");
            metodos.esperarElemento(el.getTerceiraSeta(), "Espero_elemento_ficar_clicavel");
            metodos.toque(el.getTerceiraSeta(), "Clico_na_seta_para_prosseguir");
            metodos.esperarElemento(el.getShoppingSaoPaulo(), "Espero_elemento_ficar_clicavel");
            metodos.toque(el.getShoppingSaoPaulo(), "Escolho_Shopping_Sao_Paulo");

    }
        public void envioConviteParaNovoMembroDoPlanoFamilia(String descricaoPasso)  throws  IOException, InterruptedException {

            metodos.esperarElemento(el.getPerfil(),"Espero_elemento_ficar_clicavel");
            metodos.toque(el.getPerfil(),"Clico_no_botao_perfil");
            metodos.esperarElemento(el.getMenuPlanoFamilia(),"Espero_elemento_ficar_clicavel");
            metodos.toque(el.getMenuPlanoFamilia(),"Clico_no_botao_de_plano_familia");
            metodos.esperarElemento(el.getAdicionarMembro(),"Espero_elemento_ficar_clicavel");
            metodos.toque(el.getAdicionarMembro(),"Clico_no_botao_adicionar_membro");
            metodos.esperarElemento(el.getNomeDoNovoMembro(),"Espero_elemento_ficar_clicavel");
            metodos.toque(el.getNomeDoNovoMembro(),"Clico_para_preencher_o_nome_do_membro");
            metodos.esperarElemento(el.getNomeDoNovoMembro(),"Espero_elemento_ficar_clicavel");
            metodos.escrever(el.getNomeDoNovoMembro(),"Teste","Escrevo_nome_do_novo_membro");
            metodos.esconderTeclado("Escondo_teclado");
            metodos.esperarElemento(el.getSobrenomeDoNovoMembro(),"Espero_elemento_ficar_clicavel");
            metodos.toque(el.getSobrenomeDoNovoMembro(),"Clico_para_preencher_o_sobrenome_do_membro");
            metodos.escrever(el.getSobrenomeDoNovoMembro(),"Testes","Escrevo_sobrenome_do_novo_membro");
            metodos.esconderTeclado("Escondo_teclado");
            metodos.esperarElemento(el.getTelefoneDoMembro(),"Espero_elemento_ficar_clicavel");
            metodos.toque(el.getTelefoneDoMembro(),"Clico_para_inserir_telefone_do_novo_membro");
            metodos.escrever(el.getTelefoneDoMembro(),"11952652123","Preencho_campo_com_o_numero_do_membro");
            metodos.esconderTeclado("Escondo_teclado");
            metodos.esperarElemento(el.getEmailDoNovoMembro(),"Espero_elemento_ficar_clicavel");
            metodos.toque(el.getEmailDoNovoMembro(),"Clico_para_inserir_email_do_novo_membro");
            metodos.escrever(el.getEmailDoNovoMembro(),"kethilyn.leal@gmail.com","Escrevo_email_do_novo_membro");
            metodos.esconderTeclado("Escondo_teclado");
            metodos.esperarElemento(el.getEnvioDeConvitePorSMS(),"Espero_elemento_ficar_clicavel");
            metodos.toque(el.getEnvioDeConvitePorSMS(),"Clico_na_opcao_de_envio_por_SMS");
            metodos.esperarElemento(el.getBotaoOkParaEnvioDeConvitePorSMS(),"Espero_elemento_ficar_clicavel");
            metodos.toque(el.getBotaoOkParaEnvioDeConvitePorSMS(),"Dou_ok_para_o_envio_do_convite");
            metodos.capturarTelaDeEnvioDeConvite("01_Envio_de_convite_encaminhado_por_SMS");
            metodos.pausa(2000,"Espero_cinco_segundos");
            metodos.validarTexto(el.getBotaoOkParaEnvioDeConvitePorSMS(),"O convite foi enviado! Agora é só aguardar que o(a) teste aceite fazer parte do seu plano.", "Valido_texto");









        }


}




