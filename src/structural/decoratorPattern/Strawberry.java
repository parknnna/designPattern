package structural.decoratorPattern;

public class Strawberry extends CakeComponentDecorator {
    public Strawberry(CakeComponent cakeComponent) {
        super(cakeComponent);
    }
 
    @Override
    public String decorate() {
        return decorateCake() + super.decorate();
    }
 
    private String decorateCake() {
        return "딸기 ";
    }
 
}