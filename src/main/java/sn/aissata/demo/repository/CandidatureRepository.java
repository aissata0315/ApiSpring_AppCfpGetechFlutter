package sn.aissata.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.aissata.demo.entities.Candidature;

@Repository
public interface CandidatureRepository  extends JpaRepository<Candidature,Integer> {
}
