package liskovSubstitution.step2;

public abstract class BaseRepository<T> {

    protected abstract T create(T entity);
    protected abstract T update(T entity);
}
