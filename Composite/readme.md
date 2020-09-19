# Composite 

Um Composite é um objeto projetado como uma composição de um ou mais semelhantes objetos (componentes), todos exibindo funcionalidade semelhante.

- O conceito-chave é que você pode manipular uma única instância do objeto apenas como você faria com um grupo deles.
- O padrão Composto é útil para projetar uma interface comum para ambos componentes individuais e compostos para que os programas clientes possam visualizar ambos os componentes individuais e grupos de componentes uniformemente.

#### Pode ser usado para:

- Construir hierarquias parte-todo;
- Construir representação de dados de árvores;
- Quando você deseja que seus clientes ignorem a diferença entre as composições de objetos e objetos individuais.

As classes e objetos participantes nesse padrão são:

####  Componente

-	Declara a interface para objetos nessa composição.
-	Implementa o comportamento padrão para a interface comum à todas as classes.
-	Declara uma interface para acessar os componentes-filho.
-	(Opcional) - Define uma interface para acessar os componentes-pai na estrutura recursiva, e a implementa se for apropriado.

#### Folha

-	Representa o objeto folha na composição. A folha não tem nenhum componente-filho.
-	Define o comportamento para objetos primitivos na composição.
-	Herda todos os métodos de Component porém só implementa de fato os que lhe interessam,neste caso o método Operation, nos outros são inseridos exceções que serão geradas em tempo de execução.

#### Composite

- Define o comportamento para componentes que possuam componentes-filho.
- Armazena componentes-filho.
- Implementa funções relacionadas aos componentes-filho na interface do Componente.

#### Cliente

- Manipula objetos da composição através da interface do Componente.

#### Abaixo um exemplo de como deve ser a estrutura do Composite 

![Estrutura](https://raw.githubusercontent.com/IgorAmato/Faculdade/master/Composite/Estrutura.png)

### Exemplo de código:

O exemplo a seguir, escrito em Java, implementa uma classe gráfica, na qual, pode ser uma elipse ou uma composição de diversas outras formas geometrias, que, todas podem ser representadas no gráfico.

Ele pode ser estendido para implementar diversos outras formas geográficas (círculo, quadrado, etc.) no gráfico.

![Link do exemplo](https://github.com/IgorAmato/Faculdade/blob/master/Composite/exemplo.java)





