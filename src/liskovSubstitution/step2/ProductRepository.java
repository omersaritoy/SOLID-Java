package liskovSubstitution.step2;

import liskovSubstitution.step1.models.Product;

public class ProductRepository extends BaseRepository<Product> {
    @Override
    protected Product create(Product entity) {
        return null;
    }

    @Override
    protected Product update(Product entity) {
        return null;
    }
    public Product findById(int id) {
        return null;
    }
}
