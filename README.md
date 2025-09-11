# Design e Arquitetura de Software 

  AULA 31/07/25

Abstração -> Entender um problema real e representar em um código 

API -> Abstrae as funcionalidades do BackEnd

Complexidade é uma forma de destacarmos um código, onde podemos separar em partes para deixar o código claro e de simples entendimento, para que em futuras manutenções, possa achar o ponto correto para alteração.
Uma boa notação do código é essencial para ter uma visão clara do código, o que ajuda a referenciar métodos e atributos e entender como o código está funcionando.

Frameworks são todos iguais, então aprender e focar em 1, aprende utilizar todos
Escolha do framework para implementar o código é fundamental para o procedimento do sistema.

Para concorrer em grandes Big Techs (Google, Spotify, Amazon...) precisa conhecer Estrutura de Dados (Grafos, Árvores...)

Jogos trazem a tela bonito pra você, mas escondem por trás uma API recebendo Request e enviando Response

===========================================================================
                                                                           
  AULA 04/08/25

GETTER e SETTER são utilizados para processos de encapsulamento

Coesão -> - Facilita a implementação de uma classe, bem como o seu entendimento e manutenção
          - Facilita a aloação de um único responsável por manter uma classe
          - Facilita o reúso e teste de uma classe, pois é mais simples reusar e testar uma classe coesa do que uma classe com várias responsabilidades

Acoplamento -> Maximiza a coesão das classes e miniza o acoplamentos entre elas 

- Utilizar um código acoplado, quer dizer que códigos de fora não podem entrar e se vincular para utilização do código

- Utilizar um código não acoplado, quer dizer que códigos de fora podem ser utilizados, mesmo sem participar de todos o processo da criação do código, pois se encontra para utilização (Exemplo: Entrada USB - Headset, mouse, teclado)

===========================================================================
AULA 07/08

Robert Martin:
  - Clean Architeture
  - Clean Code
  - Clean Encoder

S -> Single Responsibilty Principle
     Aplicação direto da ideia de coesão "Existir um único motivo para modificar uma classe do sistema"
     Entity -> Dados
     Repository -> JPA Spring Data
     Services -> Lógica (Use Cases)
     Controller -> API Rest
    
O -> Open/Closed Principle
  - Classe que deve estar fechada para modificações e aberta para extensões
  - Alterar o código principal, sem precisar mexer no código, extendendo ele em uma outra classe e modificando os métodos
     

L -> Liskov Substitution Principle
   - Manter assinatura dos filhos (métodos) que herdou do pai, sem modificar as heranças. Se trocar os métodos, não afetará o código e irá continuar funcionando sem problemas

I -> Interface Segregation Principle
     Segregação de Interface -> Ter uma métodos em cada interface para implementar

D -> Dependency Inversion Principle

===========================================================================

AULA 11/08

Classe (Controladores) deve estabelecer depencias prioritariamente com abstrações (Interface de serviço) e não com implementações concretas (Interface Impl)

Herança expõe para subclasses detalhes de implementação das classes pai. Logo, frequentemente diz-se que herança viola o encapsulamento

Herança não é a bala de prata, com ela, não é possível corrigir todos os problemas do código (pode até criar outros)

Um método pode chamar qualquer coisa que esteja instaciado dentro dele

Só pode implementar outros métodos seguindo os dados: 
 - Dados da própria classe]
 - Objetos passados por parâmetro
 - Objetos criado pelo próprio método
 - Atributos de classes do método

===========================================================================

Aula 18/08

Design Patterns

sublinhado em uma diagrama UML, seria para mostrar que a variável/atributo seria estático (static)

Variáveis globais são static.

Design Pattern aponta para ele mesmo no UML

===========================================================================

Aula 28/08

Arquitetura de Software

Características de Arquitetura (Qualidades do Sistema)

São chamadas também de atributos de qualidade ou requisitos não funcionais.

Diferente dos requisitos funcionais (que descrevem o que o sistema faz), elas descrevem como o sistema deve se comportar.

Não são necessárias para o sistema “funcionar” de forma básica, mas garantem que ele seja eficiente, seguro, escalável e confiável no ambiente real de uso.

Exemplos de características:

Disponibilidade → tempo em que o sistema fica acessível sem interrupções.

Confiabilidade → capacidade de executar sem erros frequentes.

Testabilidade → facilidade de testar automaticamente e validar o sistema.

Escalabilidade → capacidade de crescer conforme a demanda (ex: mais usuários).

Segurança → proteção contra acessos não autorizados, vazamento de dados.

Agilidade → velocidade em adaptar-se a mudanças do negócio.

Tolerância a falhas → continuar funcionando mesmo que partes falhem.

Elasticidade → aumentar ou reduzir recursos de forma dinâmica (ex: em cloud).

Recuperabilidade → tempo de recuperação após falhas.

Desempenho → tempo de resposta e uso eficiente dos recursos.

Implementabilidade → facilidade de implementar, integrar e evoluir.

Capacidade de aprendizagem → facilidade de compreensão pela equipe de desenvolvimento.

💡 Exemplo:
Uma aplicação de Supply Chain pode usar Kubernetes para garantir elasticidade, escalabilidade e tolerância a falhas, já que a carga de pedidos varia bastante em períodos diferentes (ex: Black Friday).

---------------------------

2. Decisões de Arquitetura

São escolhas sobre tecnologias, modelos e práticas que atendam os requisitos funcionais e de qualidade.

Normalmente seguem padrões ou soluções já consolidadas no mercado para reduzir riscos.

Exemplos:

Escolher Java + Spring Boot para um sistema financeiro, porque já é consolidado e bem aceito (ex: Conta Azul).

Definir se o sistema será monolítico ou de microsserviços.

Decidir se usará banco relacional (MySQL, PostgreSQL) ou NoSQL (MongoDB).

Optar por arquitetura em nuvem com containers e Kubernetes para gerenciar a escalabilidade.

---------------------------

3. Princípios de Arquitetura

São diretrizes que orientam as decisões para manter consistência e qualidade.

Devem ser aplicados de forma contínua em todo o desenvolvimento.

Exemplo do texto:

Mensageria assíncrona: em sistemas de microsserviços, a comunicação via mensagens (ex: Kafka, RabbitMQ) é preferida em vez de chamadas síncronas (REST), pois:

Aumenta o desempenho.

Reduz o acoplamento entre serviços.

Melhora a resiliência: se um serviço estiver fora do ar, a mensagem é processada depois.

💡 Exemplo prático:
No Supply Chain, um serviço de pagamento publica um evento "Pagamento Aprovado".
Outros serviços interessados (ex: estoque, faturamento) recebem e processam esse evento de forma assíncrona, sem depender diretamente do pagamento estar online no mesmo instante.

===========================================================================

Aula 04/09

Arquitetura vs Design

Pode ser confusa as vezes, pois precisam se comunicar/entender para o projeto dar seguimento sem atrasos. A parte da arquitetura seria responsável pela análise dos requisitos comerciais para extração e difinição das características da arquitetura. Esses processos são repassados para a equipe de desenvolvimento, que é responsável pela criação de diagramas de classe, criação de telas de interface e codifição e teste do código-fonte. 
Algumas decisões que a equipe de arquitetura toma, não está de acordo com a equipe de desenvolvimento e não funciona para as duas equipes. E as decisões da equipe de desenvolvimento, não atende as especificações da arquitetura. Dessa maneira, as duas equipes não se conversam e não se entendem para dar prosseguimento no projeto em acordo com ambos.
Para fazer a arquitetura funcionar, arquiteto e desenovolvedor devem saber se comunicar corretamente, precisam estar no mesmo espaço de ideias e conhecimento, estando de acordo com todos os processos e decisões tomadas pela equipe ao longo do projeto.

Arquivo T
