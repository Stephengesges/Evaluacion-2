/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Evaluacion2.Service;

import com.example.Evaluacion2.Model.Reserva;
import com.example.Evaluacion2.Repository.ReservaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LAB-SISE-PP
 */
@Service
public class ReservaService {

    @Autowired
    private ReservaRepository repository;

    public List<Reserva> listarReservas() {
        return repository.findAll();
    }

    public void guardarReserva(Reserva reserva) {
        repository.save(reserva);
    }

    public Optional<Reserva> buscarReservaPorId(Long id) {
        return repository.findById(id);
    }

    public void eliminarReserva(Long id) {
        repository.deleteById(id);
    }
}
