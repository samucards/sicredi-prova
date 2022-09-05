#Author: samuca_rds@yahoo.com.br


@tag
Feature: Sicredi

Scenario: Preenchimento de formulario

Given  que acesse a url "https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap"
And selecione a opcao AddRecord
And preencha o formulario com o nome "Teste Sicredi"
And preencha o last name "Teste"
And preencha o contactFirstname "Samuel xavier"
And preencha o phone "519999-9999"
And preencha o AddressLine1  "Av Assis Brasil, 3970"
And preencha o AddressLine2 "Torre D"
And preencha o City "Porto Alegre"
And preencha o State "RS"
And preencha o PostalCode "91000-000"
And preencha o Country "Brasil"
And preencha o from Employeer "Fixter"
And preencha o CreditLimit "200"
When clicar no botao save
Then realizo validacao da mensagem "Your data has been successfully stored into the database. Edit Record or Go back to list"