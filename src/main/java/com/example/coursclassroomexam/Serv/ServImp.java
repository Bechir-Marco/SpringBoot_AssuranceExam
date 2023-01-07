package com.example.coursclassroomexam.Serv;



import com.example.coursclassroomexam.Entities.Assurance;
import com.example.coursclassroomexam.Entities.Beneficiaire;
import com.example.coursclassroomexam.Entities.Contrat;
import com.example.coursclassroomexam.Repo.AssuranceRepo;
import com.example.coursclassroomexam.Repo.BeneficiaireRepo;
import com.example.coursclassroomexam.Repo.ContratRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ServImp implements Serv {

    @Autowired
    AssuranceRepo assuranceRepo;
    @Autowired
    BeneficiaireRepo beneficiaireRepo;
    @Autowired
    ContratRepo contratRepo;


    @Override
    public Beneficiaire ajouterBeneficiaire (Beneficiaire bf){
        return beneficiaireRepo.save(bf);
    }
    public Contrat ajouterContrat (Contrat c) {
        return contratRepo.save(c);
    }
    @Transactional
    public Assurance ajouterAssurance (Assurance a, int cinBf, String matricule){
        Beneficiaire b = beneficiaireRepo.findBeneficiaireByCin(cinBf);
         Contrat c = contratRepo.findContratByMatricule(matricule);
        a.setContrat(c);
        a.setBeneficiaire(b);
          return  assuranceRepo.save(a);
    }
    public Contrat getContratBf (int idBf) {

        Beneficiaire b = beneficiaireRepo.findById(idBf).orElse(null);
        Contrat contrat = b.getAssuranceList().get(0).getContrat();
//        Assurance assurance = assuranceRepo.findAssuranceByBeneficiaire(b);
        Date d = contrat.getDateEffet();
        for (int i =1 ; i< b.getAssuranceList().size();i++) {
            Assurance assurance = b.getAssuranceList().get(i);
            if(d.after(assurance.getContrat().getDateEffet())) {
                contrat = assurance.getContrat();
            }
        }

    return contrat;
    }
}

