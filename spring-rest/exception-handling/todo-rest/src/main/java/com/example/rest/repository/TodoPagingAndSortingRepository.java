package com.example.rest.repository;

import com.example.rest.entity.Todo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TodoPagingAndSortingRepository extends PagingAndSortingRepository<Todo, Integer> {

}
