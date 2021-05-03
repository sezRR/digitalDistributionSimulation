package concretes;

import abstracts.EntityRepositoryService;

public class BaseEntityRepository<T> implements EntityRepositoryService<T> {

	@Override
	public void add(T entity) {
		System.out.println("Entity added to database");
	}

	@Override
	public void update(T entity) {
		System.out.println("Entity updated on database");
	}

	@Override
	public void delete(T entity) {
		System.out.println("Entity deleted from database");
	}

}
