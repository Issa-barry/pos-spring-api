package com.pos.pos.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "jwt")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Jwt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean desactive;
    private boolean expire;
    @Getter
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
    private String valeur;

}
