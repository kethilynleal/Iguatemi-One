#Author: Kethilyn Leal
#language: pt

@Executa
Funcionalidade: Testes de funcionalidade no aplicativo IguatemiOne
  Eu como usuário quero executar testes no aplicativo

  @Executa
  Cenario: Login positivo com conta existente
    Dado que eu acesse o aplicativo
    Quando insiro os dados para fazer o login positivo
    Entao finalizo o teste

  @Executa
  Cenario: Login negativo com conta existente
    Dado que eu acesse o aplicativo
    Quando insiro os dados para fazer o login negativo sem senha
    Entao finalizo o teste