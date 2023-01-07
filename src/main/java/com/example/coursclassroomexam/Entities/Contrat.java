package com.example.coursclassroomexam.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    int id ;
   String matricule;
    @Temporal(TemporalType.DATE)
   Date dateEffet;
    @Enumerated(EnumType.STRING)
    TypeContrat typeContrat;

}
