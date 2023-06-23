package com.facens.gestao_laboratorio.controller;

import com.facens.gestao_laboratorio.dto.EquipmentDTO;
import com.facens.gestao_laboratorio.entity.Equipment;
import com.facens.gestao_laboratorio.service.IEquipmentService;
import com.facens.gestao_laboratorio.service.ILaboratoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipments")
public class EquipmentController {

    private IEquipmentService equipmentService;

    public EquipmentController(IEquipmentService equipmentService) {this.equipmentService = equipmentService;}

    @PostMapping
    public String saveEquipment(@RequestBody EquipmentDTO dto){
        Equipment equipment = equipmentService.save(dto.toEntity());
        return "Equipamento Salvo";
    }
}
