public class FactoryCImpl implements IFactory {
    @Override
    public Product createProduct() {
        return new Product("CCC", 789);
    }
}
