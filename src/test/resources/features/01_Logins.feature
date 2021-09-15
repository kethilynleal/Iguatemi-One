#Author: Kethilyn Leal
#language: pt

@nExecuta
Funcionalidade: Testes de funcionalidade no aplicativo IguatemiOne
  Eu como usuário quero executar testes no aplicativo

  Contexto: Acessar aplicativo
    Dado que eu acesse o aplicativo

  @Executa
  Cenario: Login positivo com conta existente
    Quando insiro os dados para fazer o login positivo
    Entao finalizo o teste

  @Executa
  Cenario: Login negativo com conta existente
    Quando insiro os dados para fazer o login negativo
    Entao finalizo o teste