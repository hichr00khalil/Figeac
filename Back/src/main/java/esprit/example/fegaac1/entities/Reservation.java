package esprit.example.fegaac1.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_reservation;

    private LocalDate dateDebut;
    private LocalDate dateFin;


    @ManyToOne(cascade = CascadeType.ALL)
    Appartement  appartements;
    @ManyToOne(cascade = CascadeType.ALL)
    Paiment  paiment;


    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_app")
    private Appartement appartement;
}