package com.facens.gestao_laboratorio.repository;

import com.facens.gestao_laboratorio.entity.Equipment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment,Long> {

}
