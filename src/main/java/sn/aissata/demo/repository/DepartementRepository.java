package sn.aissata.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.aissata.demo.entities.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Integer> {
}
