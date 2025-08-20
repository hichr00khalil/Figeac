package esprit.example.fegaac1.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_chat;

    private String content;
    private LocalDateTime date;
    private String expediteur;
    private String destinataire;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
