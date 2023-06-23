package com.facens.gestao_laboratorio.service.impl;

import com.facens.gestao_laboratorio.dto.EquipmentDTO;
import com.facens.gestao_laboratorio.entity.Equipment;
import com.facens.gestao_laboratorio.repository.EquipmentRepository;
import com.facens.gestao_laboratorio.service.IEquipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class EquipmentService implements IEquipmentService {

    private EquipmentRepository equipmentRepository;

    @Override
    public Equipment save(Equipment dto) {
        Equipment equipment = new Equipment();
        equipment.setEquipment(dto.getEquipment());
        equipment.setDescription(dto.getDescription());

        return equipmentRepository.save(equipment);
    }

    @Override
    public EquipmentDTO getEquipment(Integer id) {
        return null;
    }

    @Override
    public String remove(Integer id) {
        return null;
    }

    @Override
    public ArrayList<EquipmentDTO> getAllEquipment() {
        return null;
    }
}