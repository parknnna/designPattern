package structural.decoratorPattern;

public class Chocolate extends CakeComponentDecorator {
    public Chocolate(CakeComponent cakeComponent) {
        super(cakeComponent);
    }
 
    @Override
    public String decorate() {
        return decorateCake() + super.decorate();
    }
 
    private String decorateCake() {
        return "초코 ";
    }
 
}