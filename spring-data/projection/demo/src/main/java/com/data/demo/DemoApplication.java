package com.data.demo;

import com.data.demo.dto.TodoGroupProjectionDTO;
import com.data.demo.entity.Todo;
import com.data.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    TodoRepository todoRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//		TODO: Add a few Todos
//		Todo todo1 = todoRepository.save(new Todo(0, "Git Commit.", "HIGH", 3, "Jaydeep"));
//		System.out.println("=====Todo Saved.=====");
//		System.out.println(todo1);
//
//		Todo todo2 = todoRepository.save(new Todo(0, "Have Breakfast.", "MEDIUM", 1, "Jaydeep"));
//		System.out.println("=====Todo Saved.=====");
//		System.out.println(todo2);

//		TODO: View all Todos
//		List<Todo> todos = (List<Todo>) todoRepository.findAll();
//		for(Todo todo: todos)
//			System.out.println(todo);

//		TODO: Find Todos by HIGH Priority
//		List<Todo> todos = (List<Todo>) todoRepository.findByTodoPriority("HIGH");
//		for(Todo todo: todos)
//			System.out.println(todo);

//		TODO: Group Query

//		Object 2d Array as retrieval type
//		[[4,"HIGH"],[1,"LOW"]]

//		Object[][] rows = todoRepository.groupByTodoPriorityCount();
//		for (int i = 0; i < rows.length; i++) {
//			System.out.println("COUNT:" + rows[i][0]);
//			System.out.println("PRIORITY:" + rows[i][1]);
//		}

		// Using Projection DTO Interface

//        List<TodoGroupProjectionDTO> groupedTodos = todoRepository.groupByTodoPriorityCount();
//        for (TodoGroupProjectionDTO groupedTodo : groupedTodos) {
//			System.out.println("COUNT:" + groupedTodo.getTodoCount());
//			System.out.println("PRIORITY:" + groupedTodo.getTodoPriority());
//		}

//		TODO: View all Todos matching a phrase in todoDescription using JPQL
//        List<Todo> todos = todoRepository.findByPhraseLike("%T%");
//        for (Todo todo : todos)
//            System.out.println(todo);


    }
}
