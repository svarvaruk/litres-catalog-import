package com.library.importer.repository;

import org.springframework.data.repository.CrudRepository;

import com.library.importer.dao.BookEntity;

public interface BookRepository extends CrudRepository<BookEntity, String>{

}
