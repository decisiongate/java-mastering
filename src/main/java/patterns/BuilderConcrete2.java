package patterns;

public class BuilderConcrete2 extends Builder
{
    private BuilderProduct product = new BuilderProduct(2);
    @Override
    public void buildProductA() {
        product.addPart("2A");
    }

    @Override
    public void buildProductB() {
        product.addPart("2B");
    }

    @Override
    public BuilderProduct getResult() {
        return product;
    }
}
