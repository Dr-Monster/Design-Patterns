public class FactoryAImpl implements IFactory {
    @Override
    public Product createProduct() {
        return new Product("AAA", 123);
    }
}
