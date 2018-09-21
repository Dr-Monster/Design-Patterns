public class FactoryBImpl implements IFactory {
    @Override
    public Product createProduct() {
        return new Product("BBB", 456);
    }
}
