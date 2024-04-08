package org.jpaspringdata.repository;


import org.jpaspringdata.entity.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoEntity, Integer> {


    public List<ToDoEntity> findByName(String name);
    public List<ToDoEntity> findByDescription(String description);

}
