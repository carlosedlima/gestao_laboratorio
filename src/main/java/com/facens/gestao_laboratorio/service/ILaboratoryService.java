package com.facens.gestao_laboratorio.service;

import com.facens.gestao_laboratorio.dto.LaboratoryDTO;
import com.facens.gestao_laboratorio.entity.Laboratory;

import java.util.ArrayList;

public interface ILaboratoryService {

    Laboratory save(Laboratory dto);

    LaboratoryDTO getLaboratory(Integer id);

    String remove(Integer id);

    ArrayList<LaboratoryDTO> getAllLaboratorys();

}
