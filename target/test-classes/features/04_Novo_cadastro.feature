#Author: Kethilyn Leal
#language: pt

@nExecuta
Funcionalidade: Testes de funcionalidade no aplicativo IguatemiOne
  Eu como usuário quero executar testes no aplicativo

  @Executa
  Cenario: Novo cadastro no aplicativo Iguatemi One
    Dado que eu acesse o aplicativo
    Quando faco novo cadastro
    E dados pessoais
    E insiro dados de contato
    E crio uma senha e aceito os termos
    E escolho shopping favorito
    Entao finalizo o teste