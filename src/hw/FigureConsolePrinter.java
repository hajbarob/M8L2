package hw;

public class FigureConsolePrinter implements FigurePrinter{
    @Override
    public void print(Shape sh) {
        System.out.println(sh);
    }
}
