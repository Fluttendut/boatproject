package repository;

import entities.Boat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoatTypeRepository extends JpaRepository<Boat, Long> {}
