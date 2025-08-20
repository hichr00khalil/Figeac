package esprit.example.fegaac1.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_main;

    private String description;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
