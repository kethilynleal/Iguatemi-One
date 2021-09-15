#Author: Kethilyn Leal
#language: pt

@nExecuta
Funcionalidade: Testes de funcionalidade no aplicativo IguatemiOne
  Eu como usuário quero executar testes no aplicativo

  Contexto: Acessar aplicativo
    Dado que eu acesse o aplicativo

  @Executa
  Cenario: Layout de Notas Fiscais
    Quando insiro os dados para fazer o login positivo
    E verifico notas fiscais lancadas e valido layout
    Entao finalizo o teste