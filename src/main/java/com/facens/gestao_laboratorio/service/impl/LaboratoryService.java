package com.facens.gestao_laboratorio.service.impl;

import com.facens.gestao_laboratorio.dto.LaboratoryDTO;
import com.facens.gestao_laboratorio.entity.Laboratory;
import com.facens.gestao_laboratorio.repository.LaboratoryRepository;
import com.facens.gestao_laboratorio.service.ILaboratoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class LaboratoryService implements ILaboratoryService {

    private  LaboratoryRepository laboratoryRepository;

    @Override
    public Laboratory save(Laboratory dto) {

        Laboratory laboratory = new Laboratory();

        laboratory.setLaboratoryName(dto.getLaboratoryName());
        return laboratoryRepository.save(laboratory);

    }

    @Override
    public LaboratoryDTO getLaboratory(Integer id) {
        return null;
    }

    @Override
    public String remove(Integer id) {
        return null;
    }

    @Override
    public ArrayList<LaboratoryDTO> getAllLaboratorys() {
        return null;
    }
}
