package esprit.example.fegaac1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Acess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_acces;

    private String login;
    private String motPass;
    private boolean actif;
    private LocalDateTime dateExpiration;
    private LocalDateTime derniereConnexion;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
