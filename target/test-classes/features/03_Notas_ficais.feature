#Author: Kethilyn Leal
#language: pt

@Executa
Funcionalidade: Testes de funcionalidade no aplicativo IguatemiOne
  Eu como usuário quero executar testes no aplicativo

  @Executa
  Cenario: Layout de Notas Fiscais
    Dado que eu acesse o aplicativo
    Quando insiro os dados para fazer o login positivo
    E verifico notas fiscais lancadas
    E valido Layout de pagina de notas fiscais
    Entao finalizo o teste