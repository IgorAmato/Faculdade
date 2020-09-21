#  Template Method

O Padrão de Projeto Template Method define os passos de um algoritmo e permite que a implementação de um ou mais desses passos seja fornecida por subclasses. Assim, o Template Method protege o algoritmo e fornece métodos abstratos para que as subclasses possam implementá-los.

O Template Method fornece uma estrutura fixa, de um algoritmo, esta parte fixa deve estar presente na superclasse, sendo obrigatório uma classeAbstrata que possa conter um método concreto, pois em uma interface só é possível conter métodos abstratos que definem um comportamento, esta é a vantagem de ser uma Classe Abstrata porque também irá fornecer métodos abstratos às suas subclasses, que por sua vez herdam este método, por Herança (programação), e devem implementar os métodos abstratos fornecendo um comportamento concreto aos métodos que foram definidos como abstratos. Com isso certas partes do algoritmo serão preenchidos por implementações que irão variar, ou seja, implementar um algoritmo em um método, postergando a definição de alguns passos do algoritmo, para que outras classes possam redefiní-los.

## Estrutura

No diagrama de classe temos a classe AbstractClass contendo o método “templateMethod()” que possui o algoritmo e quel define os métodos “primitiveOperation1()” e “primitiveOperation2()” que são abstratos. As classes concretas Concrete1 e Concrete2 implementam os métodos abstratos que serão chamados quando “templateMethod()” precisar delas. Vale salientar que o método “templateMethod()” é final, ou seja, ele não pode ser sobrescrito, seu algoritmo não pode ser mexido. Já os métodos “primitiveOperation1()” e “primitiveOperation2()” podem ser sobrescritos. Além disso, ainda poderíamos ter um método concreto ou ainda um método final que não poderia ser sobrescrito e seria utilizado no algoritmo do templateMethod(). Isso ficará mais claro no exemplo de implementação abaixo.

![Estrut](https://raw.githubusercontent.com/IgorAmato/Faculdade/master/Template%20Method/Estrut.png)

## Participantes

#### ClasseAbstrata

- Define operações abstratas que subclasses concretas definem para implementar certas etapas do algoritmo
- Implementa um Template Method definindo o "esqueleto" de um algoritmo
- O Template Method chama várias operações, entre as quais as operações abstratas da classe

####  ClasseConcreta 
- Implementa as operações abstratas para desempenhar as etapas do algoritmo que tenham comportamento específico a esta subclasse

## Quando usar o padrão Template Method

Para implementar partes invariantes de um algoritmo uma única vez e deixar subclasses implementarem o comportamento variável

Quando comportamento comum entre subclasses deveria ser fatorado e localizado numa classe comum para evitar duplicação

É um passo freqüente de "refactoring" de código

Primeiro identifique as diferenças

Substitua o código das diferenças por uma chamada a um dos novos métodos

Para controlar extensões de subclasses

Você pode definir um Template Method que chame operações-gancho (hook) e pontos específicos, permitindo extensões apenas nestes pontos

Faça com que apenas os métodos-gancho possam sofrer override, usando adjetivos de visibilidade

"public final" para o Template Method

"protected" para métodos que devem/podem sofrer override

## Código de exemplo 

[Exemplo](https://github.com/IgorAmato/Faculdade/blob/master/Template%20Method/Exemplo.java)

