package com.dio.sistemacontrolede.pontoeacesso.controller;

import com.dio.sistemacontrolede.pontoeacesso.model.WorkingDay;
import com.dio.sistemacontrolede.pontoeacesso.service.ServiceJourney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/jornada")
public class WorkingDayController {

    @Autowired
    ServiceJourney serviceJourney;

    @PostMapping
    public WorkingDay createJornada(@RequestBody WorkingDay workingDay) {
        return serviceJourney.saveJornada(workingDay);
    }

    @GetMapping
    public List<WorkingDay> getJornadaList() {
        return serviceJourney.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<WorkingDay> getJornadaByID(@PathVariable("idJornada") Long idJornada) throws Exception{
        return ResponseEntity.ok(serviceJourney.getById(idJornada).orElseThrow(() -> new Exception("Not Found !")));
    }


}
