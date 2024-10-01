package com.data.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer todoId;
    private String todoDescription;

    @Override
    public String toString() {
        return "Todo{" +
                "todoId=" + todoId +
                ", todoDescription='" + todoDescription + '\'' +
                '}';
    }
}
