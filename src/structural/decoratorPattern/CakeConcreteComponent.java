package structural.decoratorPattern;

public class CakeConcreteComponent implements CakeComponent {
    @Override
    public String decorate() {
        return "케이크";
    }
}