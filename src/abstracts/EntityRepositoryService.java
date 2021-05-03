package abstracts;

public interface EntityRepositoryService<T> {
	void add(T entity);
	void update(T entity);
	void delete(T entity);
}
