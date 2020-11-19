package com.cesario.eventoapp.controllers;

import com.cesario.eventoapp.models.Evento;
import com.cesario.eventoapp.repository.EventoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;

    @RequestMapping(value = "cadastrarEvento", method = RequestMethod.GET)
    public String formEvento(){
        return "evento/formEvento";
    }

    @RequestMapping(value = "cadastrarEvento", method = RequestMethod.POST)
    public String salvarEvento(Evento evento){
        eventoRepository.save(evento);
        return "redirect:/cadastrarEvento";
    }
}
