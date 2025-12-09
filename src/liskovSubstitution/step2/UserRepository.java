package liskovSubstitution.step2;

import liskovSubstitution.step2.model.User;

public class UserRepository extends BaseRepository<User> {
    @Override
    protected User create(User entity) {
        return null;
    }

    @Override
    protected User update(User entity) {
        return null;
    }

    public User findById(int id) {
        return null;
    }
}
