package hw;

public class FigureArrayPrinter {
    void printFiguresUsingFigurePrinter(Shape[] sa, FigurePrinter fp){
        for (Shape s : sa) {
            fp.print(s);
        }
    }
}
