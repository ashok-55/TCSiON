package com.tcs.hotelapi.hotelcontroller;

import com.tcs.hotelapi.hotelentity.surveyentity;
import com.tcs.hotelapi.hotelrepository.surveyrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.MediaType;

import java.util.List;

@RestController
@RequestMapping(value="/api/survey",consumes = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://127.0.0.1:5500")

public class surveycontroller {

    private final surveyrepository surveyRepository;

    @Autowired
    public surveycontroller(surveyrepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    @PostMapping("/addresponse") 
    public surveyentity createSurveyEntity(@RequestBody surveyentity surveyEntity) {
        return surveyRepository.save(surveyEntity);
    }

    @GetMapping("/getall")
    public List<surveyentity> getAllSurveyEntities() {
        return surveyRepository.findAll();
    }

    @GetMapping("/{id}")
    public surveyentity getSurveyEntityById(@PathVariable("id") String id) {
        return surveyRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Survey ID: " + id));
    }

    @PutMapping("/{id}")
    public surveyentity updateSurveyEntity(@PathVariable("id") String id, @RequestBody surveyentity updatedSurveyEntity) {
        surveyentity surveyEntity = surveyRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Survey ID: " + id));
        return surveyRepository.save(surveyEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteSurveyEntity(@PathVariable("id") String id) {
        surveyRepository.deleteById(id);
    }
}
