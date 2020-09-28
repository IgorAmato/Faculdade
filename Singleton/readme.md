# Singleton

O padrão Singleton permite criar objetos únicos para os quais há apenas uma instância. Este padrão oferece um ponto de acesso global, assim como uma variável global, porém sem as desvantagens das variáveis globais.

O Padrão Singleton tem como definição garantir que uma classe tenha apenas uma instância de si mesma e que forneça um ponto global de acesso a ela. Ou seja, uma classe gerencia a própria instância dela além de evitar que qualquer outra classe crie uma instância dela. Para criar a instancia tem-se que passar pela classe obrigatoriamente, nenhuma outra classe pode instanciar ela. O Padrão Singleton também oferece um ponto global de acesso a sua instância. A própria classe sempre vai oferecer a própria instância dela e caso não tenha ainda uma instância, então ela mesma cria e retorna essa nova instância criada.

### Motivation 

Às vezes, queremos que exista apenas uma única instância de uma classe no sistema.
Por exemplo, queremos apenas um gerenciador de janelas ou apenas uma fábrica para uma família de produtos.
Precisamos ter essa instância facilmente acessível.
E queremos garantir que instâncias adicionais da classe não possam ser criadas

### Applicability

Utilize o padrão Singleton quando uma classe em seu programa deve ter apenas uma instância disponível para todos seus clientes; por exemplo, um objeto de base de dados único compartilhado por diferentes partes do programa.

 O padrão Singleton desabilita todos os outros meios de criar objetos de uma classe exceto pelo método especial de criação. Esse método tanto cria um novo objeto ou retorna um objeto existente se ele já tenha sido criado.

 Utilize o padrão Singleton quando você precisa de um controle mais estrito sobre as variáveis globais.

 Ao contrário das variáveis globais, o padrão Singleton garante que há apenas uma instância de uma classe. Nada, a não ser a própria classe singleton, pode substituir a instância salva em cache.
 
 ### Estrutura 
 
 ![Estryt](https://raw.githubusercontent.com/IgorAmato/Faculdade/master/Singleton/Estryt.png)
 
 No diagrama de classe acima tem-se o atributo singleton que é do tipo da sua própria classe e é estático, nessa variável tem-se a única instância da classe. Nos métodos pode-se observar a presença do construtor da classe Singleton() que é PRIVADO. Ou seja, um construtor privado não permite que a classe seja instanciada a não ser que seja feito por ela mesmo na qual será instanciada pelo método getInstance() que é estático e assim pode ser acessado de qualquer outra classe sem precisar instanciar Singleton. No exemplo veremos mais uma peculiaridade do método getInstance().
 
 ### Participants
 
- Define uma operação de instância que permite aos clientes acessar sua instância única. Instância é uma operação de classe (ou seja, um método de classe em Smalltalk e uma função de membro estático em C ++).

- Pode ser responsável por criar sua própria instância única.

### Exemplo 

Singleton ingênuo (thread única)

É muito fácil implementar um Singleton desleixado. Você só precisa ocultar o construtor e implementar um método de criação estático.

[Singleton.java](https://github.com/IgorAmato/Faculdade/blob/master/Singleton/Singleton.java) 

[DemoSingleThread.java](https://github.com/IgorAmato/Faculdade/blob/master/Singleton/DemoSingleThread.java)

 


