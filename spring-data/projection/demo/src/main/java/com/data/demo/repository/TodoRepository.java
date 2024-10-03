package com.data.demo.repository;

import com.data.demo.dto.TodoGroupProjectionDTO;
import com.data.demo.entity.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Integer> {

    List<Todo> findByTodoPriority(String todoPriority);

//    @Query(nativeQuery = true, value = "SELECT count(*) as todo_count, todo_priority FROM TODOS group by todo_priority;")
//    Object[][] groupByTodoPriorityCount();

    @Query(nativeQuery = true, value = "SELECT count(*) as todoCount, todo_priority as todoPriority FROM TODOS group by todo_priority")
    List<TodoGroupProjectionDTO> groupByTodoPriorityCount();

    @Query("select todo from todos todo where todo.todoDescription like ?1")
    List<Todo> findByPhraseLike(String todoDescription);

}