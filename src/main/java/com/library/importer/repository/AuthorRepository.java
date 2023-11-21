package com.library.importer.repository;

import org.springframework.data.repository.CrudRepository;

import com.library.importer.dao.AuthorEntity;

public interface AuthorRepository extends CrudRepository<AuthorEntity, String>{

}
