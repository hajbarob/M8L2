package hw;

import hw.printers.FigureArrayPrinter;
import hw.printers.FigureConsolePrinter;
import hw.printers.FigurePrinter;
import hw.shapes.Circle;
import hw.shapes.Point;
import hw.shapes.Shape;

public class AppStarter {

    public static void main(String[] args) {
        doLogic();
    }

    public static void doLogic(){
        Shape[] shapes = createFigures();
        //request how to print in console or in file
        printFigures(shapes, new FigureConsolePrinter());
    }

    public static Shape[] createFigures(){
        //read Shapes from console logic

        Circle c1 = new Circle(new Point(1, 1), 1);
        Circle c2 = new Circle(new Point(2, 1), 3);

        Circle[] ca = {c1, c2};

        return ca;
    }

    public static void printFigures(Shape[] sa, FigurePrinter fp){
        new FigureArrayPrinter().printFiguresUsingFigurePrinter(sa, fp);
    }
}
