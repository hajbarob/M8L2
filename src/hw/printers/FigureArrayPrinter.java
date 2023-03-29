package hw.printers;

import hw.shapes.Shape;

public class FigureArrayPrinter {
    public void printFiguresUsingFigurePrinter(Shape[] sa, FigurePrinter fp){
        for (Shape s : sa) {
            fp.print(s);
        }
    }
}
