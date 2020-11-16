# State 

State é um padrão de projeto de software usado quando o comportamento de um objeto muda, dependendo do seu estado.

Em certas ocasiões, quando o contexto em que está a desenvolver requer um objeto que possua comportamentos diferentes dependendo de qual estado se encontra, é difícil manejar a mudança de comportamento e os estados desse objeto, tudo dentro do mesmo bloco de código. O padrão State propõe uma solução para esta complicação, criando basicamente, um objeto para cada estado possível do objeto que o chama

### Intent

Permite que um objeto altere seu comportamento de acordo com o estado interno que se encontra em um momento dado.

### Motivação 

1. Considere a classe TCPConnection que representa uma conexão numa rede de comunicações. Um objeto TCPConnection pode estarem diversos estados diferentes: Established (Estabelecida), Listening (Escutando), Cloded (Fechada). Quando um objeto TCPConnecetion recebe solicitações de outros objetos, ele responde de maneira difente dependendo do seu estado corrente.
2. A idéia chave deste padrão é introduzir uma classe abstrata chamada TCPState para representar os estados da conexão na rede. A classe TCPState declara uma interface comum para todas as classes que representam diferentes estados operacionais. As sublclasses de TCPState implementam comportamentos específicos ao estado.
3. A classe TCPConnection mantém um objeto de estado (uma instância da subclasse de TCPstate) que representa o estado corrente na conexão TCP.
4. Connection delega todas as solicitações específicas de estados para este objeto de estado. TCPConenection usa sua instância da subclasse de TCPState para executar operações específicas ao estado da conexão.
5. Sempre que a conexão muda de estado, o objeto TCPConnection muda o objeto de estado que ele utiliza. Por exemplo, quando a conexão passa do estado Established para o estado Closed, TCPConnection substituirásua instâncaia de TCPEstablished por uma instância de TCPClosed.

### Participantes 

Contexto: Este integrante define a interface com o cliente. Mantém uma instância de Estado Concreto que define seu estado atual.
Estado: Define uma interface para encapsular as responsabilidades associadas a um estado particular de contexto.
Subclasse EstadoConcreto: Cada uma dessas subclasses implementa o comportamento ou responsabilidade de Contexto.

### Estrutura

![](https://github.com/IgorAmato/Faculdade/blob/master/State/estr.png)

### Exemplo 

[Código](https://github.com/IgorAmato/Faculdade/blob/master/State/Exemplo.java) 
