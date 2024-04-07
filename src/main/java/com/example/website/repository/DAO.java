package com.example.website.repository;

import java.util.Optional;

import com.example.website.domain.StudentUser;

public interface DAO<T> {
	public Optional<T> get(Integer id);

	int save(T t);
}
