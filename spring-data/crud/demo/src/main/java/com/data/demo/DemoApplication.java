package com.data.demo;

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
		// TODO: Insert a few todos

//		Todo todo1 = new Todo(0,"Drink Water.");
//		Todo todo2 = new Todo(0,"Have Lunch.");
//
//		Todo todoRes1 = todoRepository.save(todo1);
//		Todo todoRes2 = todoRepository.save(todo2);
//
//		System.out.println("==========Todos Saved==========");
//
//		System.out.println(todoRes1);
//		System.out.println(todoRes2);

		// TODO: Read all the todos

//		System.out.println("==========Reading Todos==========");
//		List<Todo> todos = (List<Todo>) todoRepository.findAll();
//		for (Todo todo: todos){
//			System.out.println(todo);
//		}

		// TODO: Update a todos (! UNSAFE WAY !)

//		Todo todo1 = new Todo(111,"Drink more water.");
//
//		Todo todoRes1 = todoRepository.save(todo1);
//		System.out.println("==========Todo Updated==========");
//		System.out.println(todoRes1);
		// TODO: Update a todos (. SAFE WAY .)
//		if(todoRepository.existsById(todo1.getTodoId())){
//			Todo todoRes1 = todoRepository.save(todo1);
//			System.out.println("==========Todo Updated==========");
//			System.out.println(todoRes1);
//		}
//
//		else{
//			System.out.println("==========Todo doesn't exist==========");
//		}

		// TODO: Delete a todo
//		todoRepository.deleteById(52);
//		System.out.println("==========Todo deleted MAYBE==========");

	}
}
