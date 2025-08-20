package esprit.example.fegaac1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "app_user")  // ✅ FIX: avoids conflict with SQL Server reserved word
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;

    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String numeroTelephone;

    @Enumerated(EnumType.STRING)
    private USER_ROLE user_role;



    @OneToMany(cascade = CascadeType.ALL)
    private Set<Acess> accesses;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Paiment> paiements;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Pays> pays;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Residence> residences;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Bloc> blocs;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Appartement> appartements;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Fichier> fichiers;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Maintenance> maintenances;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reclamation> reclamations;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Chat> chats;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reponse> responses;
}
