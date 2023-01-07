package com.example.coursclassroomexam.Repo;



import com.example.coursclassroomexam.Entities.Beneficiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiaireRepo extends JpaRepository<Beneficiaire, Integer> {
    Beneficiaire findBeneficiaireByCin( Integer cin);
}
