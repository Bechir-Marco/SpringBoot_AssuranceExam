package com.example.coursclassroomexam.Serv;


import com.example.coursclassroomexam.Entities.*;

import java.util.List;

public interface Serv {

    public Beneficiaire ajouterBeneficiaire (Beneficiaire bf);
    public Contrat ajouterContrat (Contrat c);
    public Assurance ajouterAssurance (Assurance a, int cinBf, String matricule);
    public Contrat getContratBf (int idBf);
}
