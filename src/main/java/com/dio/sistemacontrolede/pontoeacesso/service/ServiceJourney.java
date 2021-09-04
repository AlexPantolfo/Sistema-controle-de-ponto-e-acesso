package com.dio.sistemacontrolede.pontoeacesso.service;

import com.dio.sistemacontrolede.pontoeacesso.model.WorkingDay;
import com.dio.sistemacontrolede.pontoeacesso.repository.RepositoryJourney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceJourney {

    RepositoryJourney repositoryJourney;

    @Autowired
    public ServiceJourney(RepositoryJourney repositoryJourney) {
        this.repositoryJourney = repositoryJourney;
    }

    public WorkingDay saveJornada(WorkingDay workingDay){
        return repositoryJourney.save(workingDay);
    }

    public List<WorkingDay> findAll() {
        return repositoryJourney.findAll();
    }

    public Optional<WorkingDay> getById(Long idJornada) {
        return repositoryJourney.findById(idJornada);
    }

    public WorkingDay updateJornada(WorkingDay workingDay){
        return repositoryJourney.save(workingDay);
    }

    public void deleteJornada(Long idJornada) {
        repositoryJourney.deleteById(idJornada);
    }

}
