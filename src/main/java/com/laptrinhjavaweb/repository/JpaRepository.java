package com.laptrinhjavaweb.repository;

import java.util.List;
import java.util.Optional;

public interface JpaRepository<T> {
	List<T> findAll();
	void insert(Object object);
	void update(Object object);
	void delete(Object object);
	Optional<T> findById();
}
