package esprit.example.fegaac1.entities;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fichier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_fichier;

    @Enumerated(EnumType.STRING)
    private TYPE_FICHIER typeFichier;

    private Long  taille ;
    private LocalDate dateCreation;


    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Chat> chats;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}