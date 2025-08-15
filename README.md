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
