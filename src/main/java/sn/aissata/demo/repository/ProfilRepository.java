package sn.aissata.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.aissata.demo.entities.Profil;

@Repository
public interface ProfilRepository extends JpaRepository<Profil, Integer> {
}
