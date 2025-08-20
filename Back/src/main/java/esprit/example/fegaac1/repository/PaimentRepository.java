package esprit.example.fegaac1.repository;

import esprit.example.fegaac1.entities.Paiment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaimentRepository extends JpaRepository<Paiment, Long> {
}
