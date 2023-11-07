
@tag
Feature: Abertura de conta 
  

  @tag1
  Scenario: Fluxo do formlulário de abertura de conta pessoa Fisica
    Given que o usuário acesse a url "https://www.original.com.br/"
    And selecione o botao abrir nova conta
    And selecionar o botao abrir sua conta no picpay
    And selecionaer o botao abrir conta picpay
    When o usuario preencher o formulario
    And selecionar o checkbox 
    And selecionar o botao enviar
    Then valido o texto baixe o app e finalize seu cadastro
