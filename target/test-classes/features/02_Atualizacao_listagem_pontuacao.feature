#Author: Kethilyn Leal
#language: pt

@nExecuta
Funcionalidade: Testes de funcionalidade no aplicativo IguatemiOne
  Eu como usuário quero executar testes no aplicativo

  Contexto: Acessar aplicativo
    Dado que eu acesse o aplicativo

  @Executa
  Cenario: Atualizacao de listagem de pontuacao do holder
    Quando insiro os dados para fazer o login positivo
    E valido listagem de pontuacao e layout
    Entao finalizo o teste