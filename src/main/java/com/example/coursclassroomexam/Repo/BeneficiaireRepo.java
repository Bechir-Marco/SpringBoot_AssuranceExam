package com.example.coursclassroomexam.Repo;



import com.example.coursclassroomexam.Entities.Assurance;
import com.example.coursclassroomexam.Entities.Beneficiaire;
import com.example.coursclassroomexam.Entities.TypeContrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface BeneficiaireRepo extends JpaRepository<Beneficiaire, Integer> {
    Beneficiaire findBeneficiaireByCin( Integer cin);
    @Query("select b from Beneficiaire b join b.assuranceList ass join ass.contrat c  where c.typeContrat = :tc")
    Set <Beneficiaire> findBeneficiairesByType (@Param("tc")TypeContrat typeContrat);
}
