<!-- SOBRE O PROJETO -->
## DESCRIÇÃO DO PROJETO

<h3>1. Propósito da Aplicação:</h3>
<ul>O sistema de controle de estoque desenvolvido para a loja de veículos (LZVeiculos) tem como principal objetivo otimizar e organizar o gerenciamento dos produtos disponíveis em estoque. Ele visa facilitar o acompanhamento dos níveis de estoque, controlar o cadastro de veículos, além de fornecer uma lista com as informações de estoque. A aplicação busca aprimorar a eficiência operacional da loja, reduzir erros humanos e garantir uma gestão mais precisa dos recursos. Esse projeto foi desenvolvido para o componente curricular de Programação Orientada a Objetos no curso de Engenharia de Computação na Universidade São Francisco.</ul>

<h3>2. Público-Alvo:</h3>
<ul>O público-alvo do sistema inclui os colaboradores da loja de veículos responsáveis pela gestão do estoque, como gerentes, supervisores, e funcionários do setor de vendas e logística. A interface da aplicação será projetada de forma intuitiva, permitindo que usuários com diferentes níveis de familiaridade com sistemas de controle de estoque possam utilizá-la de maneira eficiente.</ul>

<h3>3. Principais Recursos a Serem Implementados:</h3>

<ul><b>3.1 Cadastro de Veículos:</b> Permite o cadastro detalhado de cada veículo em estoque, incluindo informações como marca, modelo, ano, cor, placa.</ul>

<ul><b>3.2 Controle de Estoque:</b> Monitoramento em tempo real dos níveis de estoque, através da visualização de uma lista com todos os veiculos cadastrados atualmente.</ul>

<ul><b>3.3 Manutenção de Estoque:</b> Manutenção de estoque, permitindo que seja possível realizar a edição de veiculos, em caso de erros técnicos ou informações incorretas na hora de seu cadastro.</ul>

<ul><b>3.4 Exclusão de Veículo:</b> O sistema permite a exclusão de veículos, para melhor gerenciamento. Utilizado ao realizar vendas ou cadastro incorreto.</ul>

<!-- MENU DESENVOLVEDOR -->
## DESENVOLVEDOR

<img src="https://raw.githubusercontent.com/MicaelliMedeiros/micaellimedeiros/master/image/computer-illustration.png" alt="ilustração de um computador" min-width="400px" max-width="400px" width="400px" align="right">

<p align="left"> 
 Meu nome é <b>Lucas Zamparo (RA: 202101432)</b>, tenho 22 anos, sou Analista de Negócios e Programador na Avery Dennison há três anos. Combinando minha paixão pela tecnologia e visão estratégica, desenvolvi soluções eficientes que impulsionam a eficiência operacional da empresa. Ao longo desse período também ingressei no curso de Engenharia de Computação na Universidade São Francisco.
</p>

<p align="left">
  💼 <b>Ocupação:</b> Analista de Negocios JR
</p>

<p align="left">
  💌 <b>Entre em contato comigo:</b> ⤵️
</p>

<p align="left">
  <a href="mailto: lucas.zamparo@gmail.com" title="Gmail">
  <img src="https://img.shields.io/badge/-Gmail-FF0000?style=flat-square&labelColor=FF0000&logo=gmail&logoColor=white&link=LINK-DO-SEU-GMAIL" alt="Gmail"/></a>

  <a href="https://www.linkedin.com/lucaszamparo" title="LinkedIn">
  <img src="https://img.shields.io/badge/-Linkedin-0e76a8?style=flat-square&logo=Linkedin&logoColor=white&link=LINK-DO-SEU-LINKEDIN" alt="LinkedIn"/></a>
  
  <a href="https://www.instagram.com/lucaszamparoo/" title="Instagram">
  <img src="https://img.shields.io/badge/-Instagram-DF0174?style=flat-square&labelColor=DF0174&logo=instagram&logoColor=white&link=LINK-DO-SEU-INSTAGRAM" alt="Instagram"/></a>
</p>

</br>

## TECNOLOGIAS UTILIZADAS

No projeto da loja de veículos, utilizamos Java e Spring Boot para o desenvolvimento da aplicação backend, aproveitando a eficiência e estrutura oferecidas por esse framework. Java é a linguagem principal, e Spring Boot simplifica a configuração e o desenvolvimento.

Além disso, empregamos o Postman para visualização e teste dos dados. O Postman permite enviar requisições HTTP para a API, facilitando a verificação e validação dos endpoints, garantindo a integridade e corretude dos dados manipulados pela aplicação. Essa combinação de tecnologias oferece uma base sólida e eficiente para a gestão de estoque e operações da loja de veículos.

</br>

* [![Java][Java.js]][Java-url]
* [![Spring][Spring.js]][Spring-url]
* [![Postman][Postman.js]][Postman-url]

<p align="right">(<a href="#readme-top">Voltar ao topo</a>)</p>


<!-- ARQUITETURA -->
## ARQUITETURA

Na arquitetura utilizamos controller e Model para criação do projeto juntamente ao Spring Boot. Segue explicação do que foi feito em cada camada:

<h3><ul><b>Controller:</b></h3> Na camada de Controller, implementamos a lógica de controle e coordenação das operações da aplicação.
Controllers em Spring Boot gerenciam as requisições HTTP, chamam métodos do Model e no caso de uma API, qual resposta, deve ser enviada de volta ao cliente.
Exemplo da loja de veículos: Um controlador de veículos pode conter métodos para listar, adicionar, atualizar ou excluir veículos no estoque.</ul>

<h3><ul><b>Model:</b></h3> A camada de Model representa a estrutura de dados da aplicação e a lógica de negócios. Entidades Java, como Veículo, são modeladas para refletir as entidades reais na loja de veículos. Repositórios Spring Data JPA são utilizados para interagir com o banco de dados, encapsulando operações de acesso a dados.
Exemplo: Uma entidade Veículo pode ter modelo, marca, cor, ano, placa e assim realizamos o cadastro dos mesmos e métodos na classe model.</ul>

<p align="right">(<a href="#readme-top">Voltar ao topo</a>)</p>

<!-- FUNCIONALIDADES -->
## FUNCIONALIDADES

<h3>1. Cadastro de Veículos (Create):</h3>
<ul>Permite a adição de novos veículos ao estoque da concessionária. Campos incluem informações detalhadas como marca, modelo, ano, cor, placa. Facilitando a entrada eficiente de novos veículos no sistema.</ul>

<h3>2. Consulta de Veículos (Read):</h3>
<ul>Fornece uma interface de consulta para visualizar todos os veículos disponíveis no estoque. Permite a visualização de uma lista apresentando informações relevantes de cada veículo de forma clara e organizada.</ul>

<h3>3. Atualização de Informações (Update):</h3>
<ul>Possibilita a edição de detalhes dos veículos, como correção de informações incorretas ou atualizações. Garante a manutenção de registros precisos no sistema.</ul>

<h3>4. Remoção de Veículos (Delete):</h3>
<ul>Permite a exclusão de veículos do sistema, especialmente útil para itens que foram vendidos ou retirados do estoque. Assegura uma gestão eficaz e atualizada do inventário.</ul>

<p align="right">(<a href="#readme-top">Voltar ao topo</a>)</p>

<h2><b>Video demonstrativo do sistema:</b></h2>
<iframe src="https://drive.google.com/file/d/125krAfCV_orfVEpgH8hbmxhmHFCmyfKC/preview" width="140" height="120" allow="autoplay"></iframe>

<!-- MARKDOWN LINKS & IMAGES -->
[Java.js]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://www.java.com/pt-BR/
[Spring.js]: https://img.shields.io/badge/SpringBoot-6DB33F?style=flat-square&logo=Spring&logoColor=white
[Spring-url]: https://spring.io/projects/spring-boot
[Postman.js]: https://img.shields.io/badge/Postman-F6BB43?style=flat-square&logo=Postman&logoColor=white
[Postman-url]: https://www.postman.com/
