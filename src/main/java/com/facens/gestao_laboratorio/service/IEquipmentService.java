package com.facens.gestao_laboratorio.service;



import com.facens.gestao_laboratorio.dto.EquipmentDTO;
import com.facens.gestao_laboratorio.entity.Equipment;

import java.util.ArrayList;

public interface IEquipmentService {

    Equipment save(Equipment dto);

    EquipmentDTO getEquipment(Integer id);

    String remove(Integer id);

    ArrayList<EquipmentDTO> getAllEquipment();

}
