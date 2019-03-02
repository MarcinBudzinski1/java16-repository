package pl.mpas.advanced_programing2.null_handling_optional;

import java.util.Optional;

public class ComputerOptional {

    private GraphicCardOptional graphicCardOptional;

    @Override
    public String toString() {
        return "ComputerOptional{" +
                "graphicCardOptional=" + graphicCardOptional +
                '}';
    }

    public Optional<GraphicCardOptional> getGraphicCardOptional() {
        return Optional.ofNullable(graphicCardOptional);
    }

    public ComputerOptional(GraphicCardOptional graphicCardOptional) {
        this.graphicCardOptional = graphicCardOptional;
    }
}
