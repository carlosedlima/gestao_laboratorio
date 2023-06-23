package com.facens.gestao_laboratorio.dto;



import com.facens.gestao_laboratorio.entity.Equipment;
import com.facens.gestao_laboratorio.service.impl.EquipmentService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EquipmentDTO {

    private long id;

    private String nameEquipment;

    private String equipment;

    private String description;


    public Equipment toEntity() {
        return new Equipment(id = this.id,
                equipment = this.equipment,
                description = this.description
        );
    }
}
