package com.contract.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.contract.model.Solicitud;

public interface SolicitudesRepository extends JpaRepository<Solicitud, Integer> {

}
