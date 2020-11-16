
  public static void main(String[] args) {

    Livro l1 = new Livro("Design Patterns");
    Livro l2 = new Livro("Java Programming Language");

    l1.solicitar(l1);    // Disponível -> Emprestado
    l1.solicitar(l1);    // Ops, o livro já está emprestado
    l1.devolver(l1);     // Emprestado -> Disponível

    l2.devolver(l2);     // nada, o livro já está disponível
  }

}
 /**
  * Livro define o contexto para este exemplo simples de padrão estado.
  * Um Livro pode estar em dois estados: Disponível ou Emprestado, de modo que
  * se escolhermos por representar o estado com um atributo, os métodos da
  * classe Livro acabariam por converter-se em condicionais sobre esse estado.
  */

public class Livro {

  private EstadoLivro estado;    // implementa associação com o estado

  private String titulo;

  // O construtor da classe, além de inicializar o título do
  // livro, define o estado inicial (Disponível). Como neste caso
  // os estados de livros têm o seu próprio estado, usamos um Singleton.

  public Livro(String titulo) {
    this.titulo = titulo;
    this.estado = Disponivel.instancia();
  }

  public String toString() {
    return (this.titulo + " (" + this.estado + ")" );
  }

  // Este método modifica o estado do livro. Problema: o método deve
  // ser acessado a partir de uma classe externa (EstadoLivro), o que exclui
  // a visibilidade private e protected. public é demasiado geral pois
  // *todas* as classes podem acessar o método. Neste caso, sugere-se a
  // visibilidade de package, com Livro e os seus estados no mesmo package.

  void estabelecerEstado(EstadoLivro estado) {
    System.out.println("Transitando de " + this.estado + " a " + estado);
    this.estado = estado;
  }

  // Os métodos de dependentes do estado delegam o comportamento
  // definido para cada estado. Uma vez que vamos dar aos estados
  // a responsabilidade de realizar as transições, passamos o livro
  // ao estado para que possa, se lhe interessar, chamar estabelecerEstado.

  public void devolver() {
    this.estado.devolver(this);
  }

  public boolean solicitar() {
    return this.estado.solicitar(this);
  }
}
/**
 * Esta é a classe abstrata que define as operações específicas do Estado.
 * Os métodos podem ser declarados abstratos, de modo que as classes
 * derivadas sejam forçadas a implementá-los, ou podem ter uma
 * implementação por padrão, definida neste nível.
 */

public abstract class EstadoLivro {

  // Os métodos devolver e solicitar são abstratos (devem ser implementados
  // pelos estados concretos) e são tomados como argumento livro, se
  // desejarmos aceder posteriormente aos atributos e métodos do mesmo.

  public abstract void devolver(Livro livro);
  public abstract boolean solicitar(Livro livro);

  // Além disso, adicionamos um método com um String que identifica o estado
  // do livro -- a definição estabelece um valor por padrão que será
  // usado se as subclasses não o redefinirem.

  public String toString() {
    return "Desconhecido";
  }
}
/**
 * Um dos estados concretos do livro. A classe Disponivel faz a
 * transição Disponivel -> Emprestado ao chamar o método solicitar.
 * Ignora as devoluções (não se contemplam várias cópias do mesmo livro)
 */

public class Disponivel extends EstadoLivro {

  // Uma vez que neste exemplo os estados dos livros não vão conter
  // atributos dependentes do contexto, fazemos com que Disponivel seja um
  // Singleton

  private static Disponivel instancia; // Instância do Singleton Disponivel

  protected Disponivel() {}

  public static Disponivel instancia() {
    if (this.instancia == null)
      this.instancia = new Disponivel();

    return this.instancia;
  }

  // Métodos específicos deste estado concreto. solicitar modifica o estado
  // do livro, enquanto que devolver simplesmente o ignora.

  public boolean solicitar(Livro livro) {
    System.out.println("Atendendo pedido do livro " + livro);
    livro.estabelecerEstado(Emprestado.instancia());
    return true;
  }

  public void devolver(Livro livro) {
    System.out.println("Oba... já tenho o livro " + livro);
  }

  // Redefine o nome do estado...

  public String toString() {
    return "Disponivel";
  }
}
/**
 * Um dos estados concretos do livro. A classe Emprestado faz a
 * transição Emprestado -> Disponivel ao chamar o método devolver.
 * Ignora os pedidos (não se contemplam reservas).
 */

public class Emprestado extends EstadoLivro {

  // Dado que neste exemplo os estados dos livros não vão conter
  // atributos dependentes do contexto, fazemos com que Emprestado
  // seja um Singleton.

  private static Emprestado instancia;  // Instância do Singleton Emprestado

  protected Emprestado() {}

  public static Emprestado instancia() {
    if (this.instancia == null)
      this.instancia = new Emprestado();

    return this.instancia;
  }

  // Métodos específicos deste estado concreto. Devolver faz a transição
  // para Disponivel, enquanto que solicitar rejeita.

  public boolean solicitar(Livro livro) {
    System.out.println("O livro " + livro + " não está disponível");
    return false;
  }

  public void devolver(Livro livro) {
    System.out.println("OK, o livro " + livro + " foi devolvido");
    livro.estabelecerEstado(Disponivel.instancia());
  }

  // Redefine o nome do estado

  public String toString() {
    return "Emprestado";
  }
}
