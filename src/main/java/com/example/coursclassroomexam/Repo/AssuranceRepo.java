package com.example.coursclassroomexam.Repo;



import com.example.coursclassroomexam.Entities.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssuranceRepo extends JpaRepository<Assurance, Integer> {


}
