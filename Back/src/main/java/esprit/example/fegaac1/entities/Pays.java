package esprit.example.fegaac1.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_country;

    private String pays;

    private String adresse;
    private String ville;
    private String localisation;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Residence> residences;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
