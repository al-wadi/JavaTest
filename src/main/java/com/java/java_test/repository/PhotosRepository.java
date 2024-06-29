package com.java.java_test.repository;

import com.java.java_test.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo , Integer> {



}
