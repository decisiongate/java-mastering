package patterns;

public class BuilderConcrete1 extends Builder
{
    private BuilderProduct product = new BuilderProduct(1);
    @Override
    public void buildProductA() {
        product.addPart("1A");
    }

    @Override
    public void buildProductB() {
        product.addPart("1B");
    }

    @Override
    public BuilderProduct getResult() {
        return product;
    }
}
