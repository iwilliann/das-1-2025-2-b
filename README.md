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

## Resumo — Livro, Capítulo 4

### Definição das Características da Arquitetura
Cada característica deve ser:
1. Específica
2. Ter influência estrutural
3. Ser essencial ou importante

Tipos de características:
- Operacionais → disponibilidade, desempenho, confiabilidade
- Estruturais → configuração, extensão, manutenção, portabilidade
- Transversais → acessibilidade, segurança, usabilidade

### Adequação Funcional
- Mede o quanto as funções do sistema atendem às necessidades do usuário.
- Inclui: totalidade funcional, correção e
