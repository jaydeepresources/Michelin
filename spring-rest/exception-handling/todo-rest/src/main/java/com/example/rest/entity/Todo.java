package com.example.rest.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data

@Entity(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer todoId;
    private String todoDescription;
    private String todoPriority;
    private Integer todoFrequency;
    private String todoCreatedBy;

}
