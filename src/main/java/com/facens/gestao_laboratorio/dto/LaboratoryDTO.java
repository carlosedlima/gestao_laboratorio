package com.facens.gestao_laboratorio.dto;

import com.facens.gestao_laboratorio.entity.Laboratory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LaboratoryDTO {
    private Long id;
    private String laboratoryName;

    public Laboratory toEntity() {
        return new Laboratory(id = this.id,
                laboratoryName = this.laboratoryName
        );
    }
}
