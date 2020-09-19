/** "Component" */
interface Graphic {

    //Printa o grafico.
    public void print();
}

/** "Composite" */
import java.util.List;
import java.util.ArrayList;
class CompositeGraphic implements Graphic {

    //Coleção de Graficos  filhos
    private List<Graphic> childGraphics = new ArrayList<Graphic>();

    //Printa o grafico
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }

    //Adiciona o grafico  a composição.
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }
    //Remove a forma geometrica da composição.
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}

/** "Leaf" */
class Ellipse implements Graphic {

    //Printa o grafico.
    public void print() {
        System.out.println("Ellipse");
    }
}

/** Client */
public class Program {

    public static void main(String[] args) {
        //Inicializa quatro elipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        //Inicializa tres componentes do grafico.
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        //Faz o grafico
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse4);

        graphic.add(graphic1);
        graphic.add(graphic2);
       // Printa quatro vezes a String Ellipse ( Ele printa o grafico completo).
        graphic.print();
    }
}
