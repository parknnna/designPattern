package structural.decoratorPattern;

public abstract class CakeComponentDecorator implements CakeComponent {
    private final CakeComponent cakeComponent;
 
    protected CakeComponentDecorator(CakeComponent cakeComponent) {
        this.cakeComponent = cakeComponent;
    }
 
    @Override
    public String decorate() {
        return cakeComponent.decorate();
    }
}