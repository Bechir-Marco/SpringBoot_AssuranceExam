package com.example.coursclassroomexam.Controllers;


import com.example.coursclassroomexam.Entities.*;
import com.example.coursclassroomexam.Serv.Serv;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;
import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exam")
public class CcController {
    private final Serv serv;
    @PostMapping("/ajouterBeneficiaire")
    public Beneficiaire ajouterBeneficiaire (@RequestBody Beneficiaire bf) {
        return serv.ajouterBeneficiaire(bf);
    }
    @PostMapping("/ajouterContrat")
    public Contrat ajouterContrat (@RequestBody Contrat c) {
        return serv.ajouterContrat(c);
    }

    @PostMapping("/ajouterAssurance/{cinBf}/{matricule}")
    public Assurance ajouterAssurance (@RequestBody Assurance a,@PathVariable("cinBf") int cinBf,@PathVariable("matricule") String matricule){
       return serv.ajouterAssurance(a, cinBf, matricule);
    }
    @GetMapping("/getContratBf/{idBf}")
    public Contrat getContratBf (@PathVariable int idBf) {
        return serv.getContratBf(idBf);
    }
    @GetMapping("/getBeneficairesByType/{typeContrat}")
    public Set<Beneficiaire> getBeneficairesByType (@PathVariable TypeContrat typeContrat) {
        return serv.getBeneficairesByType(typeContrat);
    }
    @GetMapping("/getMontantBf/{cinBf}")
    public float getMontantBf(@PathVariable int cinBf) {
       return serv.getMontantBf(cinBf);
    }
}
