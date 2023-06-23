package com.facens.gestao_laboratorio.controller;

import com.facens.gestao_laboratorio.dto.LaboratoryDTO;
import com.facens.gestao_laboratorio.entity.Laboratory;
import com.facens.gestao_laboratorio.service.ILaboratoryService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/laboratory")
public class LaboratoryController {

    private ILaboratoryService laboratoryService;

    public LaboratoryController(ILaboratoryService laboratoryService) {
        this.laboratoryService = laboratoryService;
    }

    @PostMapping
    public String saveLaboratory(@RequestBody LaboratoryDTO dto){
        Laboratory laboratory = laboratoryService.save(dto.toEntity());
        return "Laboratorio salvo";
    }
}
