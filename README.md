# Design e Arquitetura de Software

Resumo de aulas e anotações sobre princípios de design, arquitetura e boas práticas de desenvolvimento de software.

---

## Aula 31/07/2025

### Abstração
- Consiste em entender um problema real e representá-lo em código.
- API: abstrai as funcionalidades do Back-End.

### Complexidade e Clareza
- Separar o código em partes torna-o mais claro e simples de entender.
- Facilita futuras manutenções e identificações de pontos de alteração.
- Uma boa notação e organização ajudam a compreender o funcionamento do sistema.

### Frameworks
- Todos compartilham conceitos semelhantes — aprender um facilita o aprendizado dos outros.
- A escolha do framework é fundamental para o sucesso do sistema.

### Estruturas de Dados
- Para atuar em grandes Big Techs (Google, Spotify, Amazon...), é essencial conhecer:
  - Grafos
  - Árvores
  - Estruturas de Dados em geral

### Curiosidade
- Jogos exibem apenas a interface bonita ao usuário, mas internamente fazem uso de APIs que enviam requests e recebem responses.

---

## Aula 04/08/2025

### Encapsulamento
- Getters e Setters são utilizados para proteger os atributos de uma classe.

### Coesão
- Facilita a implementação, manutenção e entendimento de uma classe.
- Torna o código mais fácil de testar e reutilizar.
- Cada classe deve ter uma única responsabilidade.

### Acoplamento
- Minimizar o acoplamento entre classes maximiza a coesão.
- Código acoplado: fechado para interações externas.
- Código desacoplado: aberto para integração com outros componentes (exemplo: portas USB — headset, mouse, teclado).

---

## Aula 07/08/2025 — Princípios SOLID (Robert C. Martin)

### S — Single Responsibility Principle
- Cada classe deve ter um único motivo para mudar.
- Aplicação direta do conceito de coesão.
- Camadas comuns:
  - Entity → Dados
  - Repository → Persistência (Spring Data JPA)
  - Service → Lógica de negócio (use cases)
  - Controller → API REST

### O — Open/Closed Principle
- Classes devem estar fechadas para modificação e abertas para extensão.
- É possível estender funcionalidades sem alterar o código original.

### L — Liskov Substitution Principle
- As subclasses devem poder substituir suas superclasses sem quebrar o sistema.
- Métodos herdados devem manter assinaturas e comportamentos compatíveis.

### I — Interface Segregation Principle
- Prefira várias interfaces específicas a uma interface genérica.
- Cada interface deve ter responsabilidade única.

### D — Dependency Inversion Principle
- As classes devem depender de abstrações, não de implementações concretas.
- No Spring, isso é feito com o uso de @Autowired para injeção de dependências.

---

## Aula 11/08/2025

- Controladores devem depender de interfaces (serviços), não de classes concretas.
- Herança:
  - Expõe detalhes internos da classe pai, podendo violar o encapsulamento.
  - Não é uma “bala de prata” — pode gerar novos problemas.
- Um método só pode acessar:
  - Dados da própria classe.
  - Objetos passados por parâmetro.
  - Objetos criados dentro do método.
  - Atributos da classe.

---

## Aula 18/08/2025 — Design Patterns

- Em diagramas UML, atributos sublinhados indicam que são static.
- Variáveis globais também são static.
- Design Patterns ajudam a padronizar soluções recorrentes.

---

## Aula 28/08/2025 — Arquitetura de Software

### Características de Arquitetura (Qualidades do Sistema)
Também chamadas de atributos de qualidade ou requisitos não funcionais.

Diferem dos requisitos funcionais (o que o sistema faz), pois definem como o sistema deve se comportar.

Exemplos e significados:

- **Disponibilidade:** tempo em que o sistema permanece acessível sem interrupções.  
- **Confiabilidade:** capacidade de executar sem falhas frequentes.  
- **Testabilidade:** facilidade de testar e validar o sistema automaticamente.  
- **Escalabilidade:** capacidade de crescer conforme a demanda (exemplo: mais usuários).  
- **Segurança:** proteção contra acessos não autorizados e vazamento de dados.  
- **Agilidade:** facilidade e velocidade para se adaptar a mudanças de negócio.  
- **Tolerância a falhas:** habilidade de continuar funcionando mesmo com falhas parciais.  
- **Elasticidade:** capacidade de aumentar ou reduzir recursos dinamicamente (exemplo: em cloud).  
- **Recuperabilidade:** tempo necessário para se recuperar de uma falha.  
- **Desempenho:** tempo de resposta e uso eficiente dos recursos.  
- **Implementabilidade:** facilidade de implementar, integrar e evoluir o sistema.  
- **Capacidade de aprendizado:** facilidade de compreensão e manutenção pelo time de desenvolvimento.

Exemplo:
Um sistema de Supply Chain pode usar Kubernetes para garantir elasticidade, escalabilidade e tolerância a falhas durante picos de demanda como a Black Friday.

---

### Decisões de Arquitetura
Escolhas sobre tecnologias, modelos e práticas que atendem requisitos funcionais e de qualidade.

Exemplos:
- Java + Spring Boot para sistemas financeiros.
- Arquitetura monolítica ou de microsserviços.
- Banco relacional (MySQL, PostgreSQL) vs NoSQL (MongoDB).
- Uso de containers e Kubernetes para escalabilidade.

---

### Princípios de Arquitetura
Diretrizes que mantêm consistência e qualidade ao longo do projeto.

Exemplo:
Mensageria assíncrona com Kafka ou RabbitMQ aumenta desempenho e reduz acoplamento entre microsserviços.

---

## Aula 04/09/2025 — Arquitetura vs Design

- A arquitetura define requisitos comerciais e técnicos.
- O design implementa a parte prática (diagramas, telas, código, testes).
- Comunicação entre arquitetos e desenvolvedores é essencial.
- Arquitetos têm amplitude técnica; desenvolvedores, profundidade técnica.
- Em arquitetura, tudo é um trade-off — não existe solução perfeita.

---

## Aula 08/09/2025 — Pensamento Arquitetônico e Trade-offs

### Trade-offs
Abrir mão de simplicidade pode aumentar desempenho, escalabilidade ou robustez.

### Padrões de Mensageria

Tópico (Publisher–Subscriber)
- 1 para muitos
- Alta escalabilidade, mais impacto.
- Mensagem é enviada para todos os inscritos.

Fila (Producer–Consumer)
- 1 para 1
- Mais controle, menos impacto.
- Cada mensagem é consumida apenas uma vez.

Combinar fila e tópico cria um buffer, reduz acoplamento mas aumenta custo.

---

# Design e Arquitetura de Software

Resumo completo das aulas e anotações sobre princípios de design, arquitetura e boas práticas de desenvolvimento de software.

---

## Aula 31/07/2025

### Abstração
Abstração consiste em entender um problema real e representá-lo em código de maneira simplificada.  
Um exemplo é o uso de **APIs**, que abstraem as funcionalidades do Back-End, expondo apenas o necessário para o usuário ou outro sistema.

### Complexidade e Clareza
Separar o código em partes torna o sistema mais claro e simples de compreender.  
Essa prática facilita futuras manutenções e torna mais fácil identificar pontos que precisam de alteração.  
Uma boa notação e organização ajudam a entender o funcionamento geral do sistema.

### Frameworks
Todos os frameworks compartilham conceitos semelhantes.  
Aprender um deles facilita muito o aprendizado dos demais.  
A escolha do framework é uma decisão importante que pode impactar diretamente o sucesso do sistema.

### Estruturas de Dados
Para atuar em grandes empresas de tecnologia (como Google, Spotify ou Amazon), é essencial dominar:
- Grafos  
- Árvores  
- Estruturas de dados em geral  

Esses conceitos são a base para resolver problemas complexos e otimizar sistemas.

### Curiosidade
Jogos de computador ou console mostram apenas uma interface visual bonita ao usuário, mas internamente fazem uso de **APIs** que enviam **requisições** (requests) e recebem **respostas** (responses) constantemente.

---

## Aula 04/08/2025

### Encapsulamento
O encapsulamento serve para proteger os atributos de uma classe.  
Getters e Setters são usados para acessar e modificar esses atributos de forma controlada, evitando acessos diretos que possam comprometer o comportamento do objeto.

### Coesão
A coesão facilita a implementação, manutenção e entendimento de uma classe.  
Classes coesas têm responsabilidades bem definidas, o que torna o código mais fácil de testar e reutilizar.  
Cada classe deve ter uma única responsabilidade bem clara.

### Acoplamento
Minimizar o acoplamento entre classes maximiza a coesão do sistema.  
Um código fortemente acoplado é fechado para interações externas, enquanto um código desacoplado é aberto para integração com outros componentes.  
Exemplo: portas USB, que permitem conectar diferentes dispositivos (mouse, teclado, headset) sem modificar o computador.

---

## Aula 07/08/2025 — Princípios SOLID (Robert C. Martin)

### S — Single Responsibility Principle
Cada classe deve ter um único motivo para mudar.  
Esse princípio se relaciona diretamente com a coesão.  
Na prática, isso é aplicado separando as camadas do sistema:

- **Entity** → representa os dados.  
- **Repository** → cuida da persistência (ex: Spring Data JPA).  
- **Service** → implementa a lógica de negócio (casos de uso).  
- **Controller** → expõe a API REST para o mundo externo.

### O — Open/Closed Principle
As classes devem estar **fechadas para modificação** e **abertas para extensão**.  
Isso significa que novas funcionalidades devem ser adicionadas por meio de herança ou interfaces, sem alterar o código existente.

### L — Liskov Substitution Principle
Subclasses devem poder substituir suas superclasses sem quebrar o comportamento do sistema.  
Métodos herdados devem manter assinaturas e comportamentos compatíveis para evitar erros de execução.

### I — Interface Segregation Principle
É preferível ter várias interfaces específicas a uma interface genérica.  
Cada interface deve ter uma única responsabilidade, evitando forçar a implementação de métodos desnecessários.

### D — Dependency Inversion Principle
As classes devem depender de **abstrações**, e não de **implementações concretas**.  
No Spring, isso é feito com a injeção de dependências via `@Autowired`, permitindo trocar a implementação sem alterar a classe principal.

---

## Aula 11/08/2025

Controladores devem depender de interfaces (serviços) e não de classes concretas.  
A **herança**, embora útil, pode expor detalhes internos da classe pai e violar o encapsulamento.  
Ela deve ser usada com cuidado, pois pode criar dependências difíceis de manter.

Um método só pode acessar:
- Dados da própria classe.  
- Objetos recebidos por parâmetro.  
- Objetos criados dentro do próprio método.  
- Atributos da classe.  

Essas restrições ajudam a manter o encapsulamento e a previsibilidade do código.

---

## Aula 18/08/2025 — Design Patterns

Em diagramas UML, atributos **sublinhados** indicam que são **static**.  
Variáveis globais também são estáticas e compartilham o mesmo valor em toda a aplicação.  
Os **Design Patterns** são padrões de soluções recorrentes que ajudam a resolver problemas comuns de maneira padronizada e eficiente.

---

## Aula 28/08/2025 — Arquitetura de Software

### Características de Arquitetura (Atributos de Qualidade)

As características de arquitetura definem **como** o sistema deve se comportar, diferindo dos requisitos funcionais (que definem o que o sistema faz).

#### Exemplos de características:

- **Disponibilidade**: capacidade do sistema de estar acessível sempre que necessário.  
- **Confiabilidade**: nível de confiança no correto funcionamento do sistema ao longo do tempo.  
- **Testabilidade**: facilidade em testar o sistema de forma automatizada e isolada.  
- **Escalabilidade**: capacidade de o sistema lidar com o aumento de carga sem perda de desempenho.  
- **Segurança**: proteção contra acessos não autorizados e vulnerabilidades.  
- **Agilidade**: capacidade de adaptação a mudanças e entrega rápida de novas funcionalidades.  
- **Tolerância a falhas**: habilidade de continuar operando mesmo quando partes do sistema falham.  
- **Elasticidade**: habilidade de expandir e reduzir recursos automaticamente conforme a demanda.  
- **Recuperabilidade**: tempo e facilidade de recuperação após uma falha.  
- **Desempenho**: rapidez com que o sistema executa suas operações.  
- **Implementabilidade**: facilidade de desenvolvimento e implantação.  
- **Capacidade de aprendizado**: facilidade de novos desenvolvedores entenderem o sistema.

**Exemplo prático:**  
Um sistema de Supply Chain pode usar **Kubernetes** para garantir **elasticidade**, **escalabilidade** e **tolerância a falhas** durante períodos de alta demanda, como a Black Friday.

---

### Decisões de Arquitetura
As decisões de arquitetura envolvem escolhas sobre tecnologias, modelos e práticas que atendem tanto requisitos funcionais quanto não funcionais.

Exemplos de decisões:
- Escolha entre **Java + Spring Boot** (para sistemas corporativos) ou **Node.js** (para aplicações em tempo real).  
- Definir **arquitetura monolítica** ou **microsserviços**.  
- Selecionar entre **banco relacional** (MySQL, PostgreSQL) e **NoSQL** (MongoDB).  
- Uso de **containers** e **Kubernetes** para facilitar a escalabilidade e implantação.

---

### Princípios de Arquitetura
Os princípios de arquitetura são diretrizes que mantêm consistência e qualidade em todo o sistema.

Exemplo:  
O uso de **mensageria assíncrona** com **Kafka** ou **RabbitMQ** pode aumentar o desempenho e reduzir o acoplamento entre microsserviços.

---

## Aula 04/09/2025 — Arquitetura vs Design

- A **arquitetura** define requisitos comerciais e técnicos de alto nível.  
- O **design** implementa a parte prática, como diagramas, telas, código e testes.  
- A comunicação entre arquitetos e desenvolvedores é essencial.  
- Arquitetos têm **amplitude técnica**, enquanto desenvolvedores têm **profundidade técnica**.  
- Em arquitetura, tudo é um **trade-off** — não existe solução perfeita.

---

## Aula 08/09/2025 — Pensamento Arquitetônico e Trade-offs

### Trade-offs
Muitas vezes, é necessário abrir mão de simplicidade para alcançar desempenho, escalabilidade ou robustez.  
O arquiteto precisa avaliar cuidadosamente o custo-benefício de cada escolha.

### Padrões de Mensageria

#### Tópico (Publisher–Subscriber)
- Comunicação **1 para muitos**.  
- Alta escalabilidade, mas maior impacto.  
- Mensagens são enviadas a todos os inscritos.

#### Fila (Producer–Consumer)
- Comunicação **1 para 1**.  
- Maior controle, menor impacto.  
- Cada mensagem é consumida apenas uma vez.

Combinar filas e tópicos cria um **buffer**, reduz acoplamento e aumenta a resiliência, mas também eleva os custos de operação.

---

## Resumo — Livro, Capítulo 4

### Definição das Características da Arquitetura
Cada característica deve ser:
1. Específica.  
2. Ter influência estrutural.  
3. Ser essencial ou importante.  

#### Tipos de características:
- **Operacionais** → disponibilidade, desempenho, confiabilidade.  
- **Estruturais** → configuração, extensão, manutenção, portabilidade.  
- **Transversais** → acessibilidade, segurança, usabilidade.  

### Adequação Funcional
A adequação funcional mede o quanto as funções do sistema realmente atendem às necessidades do usuário.  
Inclui aspectos como:
- Totalidade funcional.  
- Correção.  
- Precisão dos resultados.  

---

## Conclusão
Não existe a melhor arquitetura — existe a menos pior.  
O papel do arquiteto é equilibrar os trade-offs e garantir que o sistema seja **sustentável, escalável e compreensível** a longo prazo.

