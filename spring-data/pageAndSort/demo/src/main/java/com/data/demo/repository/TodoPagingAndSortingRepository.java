package com.data.demo.repository;

import com.data.demo.entity.Todo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TodoPagingAndSortingRepository extends PagingAndSortingRepository<Todo, Integer> {

}
