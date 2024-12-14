/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Evaluacion2.Controller;

import com.example.Evaluacion2.Model.Reserva;
import com.example.Evaluacion2.Service.ReservaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author LAB-SISE-PP
 */
@Controller
@RequestMapping("/reservas")
public class ReservaController {

    private final ReservaService service;

    public ReservaController(ReservaService service) {
        this.service = service;
    }

    @GetMapping
    public String listarReservas(Model model) {
        model.addAttribute("reservas", service.listarReservas());
        return "reservas";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioReserva(Model model) {
        model.addAttribute("reserva", new Reserva());
        return "formularioReserva";
    }

    @PostMapping
    public String guardarReserva(@ModelAttribute Reserva reserva) {
        service.guardarReserva(reserva);
        return "redirect:/reservas";
    }

    @GetMapping("/editar/{id}")
    public String editarReserva(@PathVariable Long id, Model model) {
        model.addAttribute("reserva", service.buscarReservaPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id)));
        return "formularioReserva";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarReserva(@PathVariable Long id) {
        service.eliminarReserva(id);
        return "redirect:/reservas";
    }
}
