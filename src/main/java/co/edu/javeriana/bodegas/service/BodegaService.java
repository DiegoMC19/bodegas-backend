package co.edu.javeriana.bodegas.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.javeriana.bodegas.dto.BodegaDto;
import co.edu.javeriana.bodegas.dto.NuevaBodegaDto;
import co.edu.javeriana.bodegas.entity.Bodega;
import co.edu.javeriana.bodegas.repository.BodegaRepository;

@Service
public class BodegaService {

    private final BodegaRepository bodegaRepository;
    private final ModelMapper modelMapper;

    public BodegaService(BodegaRepository bodegaRepository, ModelMapper modelMapper) {
        this.bodegaRepository = bodegaRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional(readOnly = true)
    public List<BodegaDto> listar() {
        return bodegaRepository.findAll().stream()
                .map(bodega -> modelMapper.map(bodega, BodegaDto.class))
                .toList();
    }

    @Transactional
    public BodegaDto crear(NuevaBodegaDto dto) {
        Bodega bodega = new Bodega(dto.getNombre(), dto.getUbicacion());
        return modelMapper.map(bodegaRepository.save(bodega), BodegaDto.class);
    }
}
