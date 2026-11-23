package co.edu.javeriana.bodegas.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BodegaDto {
    private Long id;
    private String nombre;
    private String ubicacion;
    private List<ProductoDto> productos = new ArrayList<>();
}
