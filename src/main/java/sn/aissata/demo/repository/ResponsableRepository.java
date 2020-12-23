package sn.aissata.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.aissata.demo.entities.Responsable;

@Repository
public interface ResponsableRepository extends JpaRepository<Responsable, Integer> {
}
