/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Evaluacion2.Repository;

import com.example.Evaluacion2.Model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LAB-SISE-PP
 */
@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
