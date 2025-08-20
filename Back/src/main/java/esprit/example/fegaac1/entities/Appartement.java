package esprit.example.fegaac1.entities;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appartement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_app;

    private String titre;
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_bloc")
    private Bloc bloc;



}


