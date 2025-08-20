package esprit.example.fegaac1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_response;

    private String message;
    private LocalDate date_response;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
