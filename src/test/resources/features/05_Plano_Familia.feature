#Author: Kethilyn Leal
#language: pt

@Executa
Funcionalidade: Testes de funcionalidade no aplicativo IguatemiOne
  Eu como usuário quero executar testes no aplicativo

  Contexto: Acessar aplicativo
    Dado que eu acesse o aplicativo

  @Executa
  Cenario: Convite para novo membro de plano familia
    Quando insiro os dados para fazer o login positivo
    E envio convite para novo membro do plano familia
    Entao finalizo o teste