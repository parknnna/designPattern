package behavioral.visitorPattern;

public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}