package co.edu.javeriana.bodegas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.javeriana.bodegas.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
