package com.example.coursclassroomexam.Repo;



import com.example.coursclassroomexam.Entities.Assurance;
import com.example.coursclassroomexam.Entities.Beneficiaire;
import com.example.coursclassroomexam.Entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface AssuranceRepo extends JpaRepository<Assurance, Integer> {

            Assurance findAssuranceByBeneficiaire(Beneficiaire b);
            List <Assurance> findAssurancesByBeneficiaire(Beneficiaire b);
           List<Assurance> findAssurancesByContrat (Contrat c);
}
