package co.edu.javeriana.bodegas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.javeriana.bodegas.entity.Bodega;

@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Long> {
}
