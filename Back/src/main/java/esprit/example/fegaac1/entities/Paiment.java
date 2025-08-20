package esprit.example.fegaac1.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paiment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_paiement;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DateEmission;
    private Long montant ;
    @Enumerated(EnumType.STRING)
    private STATUS_PAIMENT status;


    @OneToMany(cascade = CascadeType.ALL)
    private Set<Fichier> Fichiers;


    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_reservation")
    private Reservation reservation;
}