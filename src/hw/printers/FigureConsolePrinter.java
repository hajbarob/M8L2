package hw.printers;

import hw.shapes.Shape;

public class FigureConsolePrinter implements FigurePrinter {
    @Override
    public void print(Shape sh) {
        System.out.println(sh);
    }
}
