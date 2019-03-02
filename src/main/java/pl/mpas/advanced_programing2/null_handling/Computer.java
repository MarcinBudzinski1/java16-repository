package pl.mpas.advanced_programing2.null_handling;

public class Computer {

    private GraphicCard graphicCard;

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public Computer(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "graphicCard=" + graphicCard +
                '}';
    }
}
