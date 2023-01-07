package com.example.coursclassroomexam.Serv;



import com.example.coursclassroomexam.Repo.AssuranceRepo;
import com.example.coursclassroomexam.Repo.BeneficiaireRepo;
import com.example.coursclassroomexam.Repo.ContratRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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




}

