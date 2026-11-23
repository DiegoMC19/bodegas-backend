package co.edu.javeriana.bodegas.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.edu.javeriana.bodegas.entity.Bodega;
import co.edu.javeriana.bodegas.entity.Producto;
import co.edu.javeriana.bodegas.repository.BodegaRepository;
import co.edu.javeriana.bodegas.repository.ProductoRepository;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner cargarDatos(BodegaRepository bodegaRepository, ProductoRepository productoRepository) {
        return args -> {
            if (bodegaRepository.count() > 0) {
                return;
            }
            Bodega norte = bodegaRepository.save(new Bodega("Bodega Norte", "Calle 170 # 45-10, Bogotá"));
            Bodega sur = bodegaRepository.save(new Bodega("Bodega Sur", "Autopista Sur # 60-25, Bogotá"));

            productoRepository.saveAll(List.of(
                    new Producto("Computador portátil", "Portátil de 15 pulgadas", 2500000.0, 15, norte),
                    new Producto("Monitor", "Monitor LED de 24 pulgadas", 750000.0, 20, norte),
                    new Producto("Impresora", "Impresora láser multifuncional", 1200000.0, 8, sur)));
        };
    }
}
