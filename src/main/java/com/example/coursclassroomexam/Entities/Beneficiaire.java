package com.example.coursclassroomexam.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Beneficiaire implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    int cin;
    String nom;
    String prenom;
    String profession;
    float salaire;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "beneficiaire")
            @JsonIgnore
    List<Assurance> assuranceList;
}
