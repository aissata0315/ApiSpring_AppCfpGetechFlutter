package sn.aissata.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.aissata.demo.entities.Formation;

@Repository
public interface FormationRepository extends JpaRepository<Formation, Integer> {
}
