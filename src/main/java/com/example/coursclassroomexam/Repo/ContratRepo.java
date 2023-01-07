package com.example.coursclassroomexam.Repo;


import com.example.coursclassroomexam.Entities.Assurance;
import com.example.coursclassroomexam.Entities.Contrat;
import com.example.coursclassroomexam.Entities.TypeContrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratRepo extends JpaRepository<Contrat, Integer> {

        Contrat findContratByMatricule(String m);
        Contrat findContratByTypeContrat(TypeContrat type);
}
