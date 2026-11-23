package co.edu.javeriana.bodegas.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NuevaBodegaDto {

    @NotBlank
    private String nombre;

    @NotBlank
    private String ubicacion;
}
