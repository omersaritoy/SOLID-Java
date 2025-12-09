package liskovSubstitution.step2;

import liskovSubstitution.step1.models.Category;

public class CategoryRepository extends BaseRepository<Category> {
    @Override
    protected Category create(Category entity) {
        return null;
    }

    @Override
    protected Category update(Category entity) {
        return null;
    }

    public void delete(Category entity) {

    }
}
