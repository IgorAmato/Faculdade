# Strategy

Defini famílias de algoritmos implementados por uma hierarquia de classes onde os objetos dessas classes são utilizados em objetos de classes clientes por meio de composição, permitindo assim a mudança de comportamento dos objetos clientes pela intercambiação de objetos de estratégia.

### Intenção

Criar uma Strategy para cada variante e fazer com que o método delegue o algoritmo para uma instância de Strategy.

### Motivação

A lógica condicional é uma das estruturas mais complexas e utilizadas no desenvolvimento de softwares corporativos. Lógicas condicionais tendem a crescer e tornar-se cada vez mais sofisticadas, maiores e mais difíceis de manter com o passar do tempo. O padrão Strategy ajuda a gerenciar toda essa complexidade imposta pelas lógicas condicionais. O Padrão Strategy sugere que se produza uma família de classes para cada variação do algoritmo e que se forneça para a classe hospedeira uma instância de Strategy para a qual ela delegará em tempo de execução. Um dos pré-requisitos para o Strategy é uma estrutura de herança onde cada subclasse específica contém uma variação do algoritmo. Assim, o padrão Strategy possui diversos benefícios como clarificar algoritmos ao diminuir ou remover lógica condicional, simplificar uma classe ao mover variações de um algoritmo para uma hierarquia, e habilitar um algoritmo para ser substituído por outro em tempo de execução.

### Aplicabilidade

Em resumo o padrão Strategy pode ser utilizado quando se tem as seguintes situações:

Quando muitas classes relacionadas diferem apenas no seu comportamento;

- Quando necessita-se de variantes de um algoritmo;
- Quando se precisa ocultar do usuário a exposição das estruturas de dados complexas, específicas do algoritmo;
- Quando uma classe define muitos comportamentos e por sua vez eles aparecem como diversos “IFs”. Com isso esses comandos condicionais são movidos para sua própria classe Strategy.

### Estrutura

![Estr](https://github.com/IgorAmato/Faculdade/blob/master/estr.png)

### Participantes

Strategy: É uma interface comum para todas as subclasses, ou para todos os algoritmos que são suportados. O Contexto usa essa interface para chamar uma das subclasses ConcreteStrategy ou um dos algoritmos definidos.
ConcreteStrategy: A classe concreta que herda da Strategy abstrata está definida como as subclasses ConcreteStrategyA, ConcreteStrategyB e ConcreteStrategyA no diagrama da figura 1.
Context: É aquele que vai acessar um dos algoritmos das subclasses de interface Strategy.

#EXEMPLO

O exemplo abaixo foi retirado do site Wikipedia 

[Codigo]](https://github.com/IgorAmato/Faculdade/tree/master/Strategy/Exemplo)
