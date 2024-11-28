package org.example.task_3.models;

import org.example.task_3.Column;

import java.util.UUID;

@org.example.task_3.Entity
public class Entity {

    @Column(name = "id", primaryKey = true)
    private UUID id;
}
