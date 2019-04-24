# ORGANIZE PROJECT (SpringBoot)

Organize é um sistema web extremamente simples que possui uma utilidade voltada ao agendamento de serviços em geral. A ideia é que o sistema seja útil para auxiliar na organização voltada à prestação de serviços.

Implementado em Java, utilizando as seguintes ferramentas: SpringBoot e Thymeleaf.


## RODANDO O PROJETO NO PC

Para ter o Organize funcionando no PC é necessário ter o Eclipse IDE instalado e abrir o projeto através do Mavem, que será o responsável por automatizar todo o processo de gerenciamento de dependências (bibliotecas / frameworks) fundamentais para rodar a aplicação. O arquivo _pom.xml_ possui toda a configuração do Mavem.

Também é necessário ter o MySQL funcionando na máquina e criar um banco de dados chamado "Agenda". Quando a aplicação for rodada pela primeira vez, serão criadas duas tabelas dentro de Agenda com o mesmo nome das duas classes model do projeto (_"agendamento"_ e _"cliente"_), essas tabelas guardarão os dados preenchidos na aplicação.


## OBSERVAÇÕES

#### Bugs para consertar:
- A página de agendamento não está salvando os dados, pois a coluna _"cliente_id"_ responsável por associar o cliente já cadastrado ao agendamento do serviço, está ficando vazia (Null).
