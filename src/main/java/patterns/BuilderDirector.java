package patterns;

public class BuilderDirector {
    public void Construct(Builder builder) {
        builder.buildProductA();
        builder.buildProductB();
    }
}
