package com.loxasoft.employesservice.service;

import com.loxasoft.employesservice.dto.DepartamentDTO;
import com.loxasoft.employesservice.dto.ResponseDTO;
import com.loxasoft.employesservice.entity.Employe;
import com.loxasoft.employesservice.repository.EmployeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeService {

    private final EmployeRepository employeRepository;

    private final RestTemplate restTemplate;

    public EmployeService(EmployeRepository employeRepository, RestTemplate restTemplate) {
        this.employeRepository = employeRepository;
        this.restTemplate = restTemplate;
    }


    public Employe saveEmploye(Employe employe){
        return employeRepository.save(employe);
    }

    public ResponseDTO getEmployeById(Integer id){

        ResponseDTO responseDTO = new ResponseDTO();
        Employe employe = new Employe();
        employe = employeRepository.findById(id).get();

        ResponseEntity<DepartamentDTO> responseEntity = restTemplate.getForEntity("http://localhost:8080//api/departaments/" +employe.getDepartamentId(), DepartamentDTO.class);

        DepartamentDTO departamentDTO = responseEntity.getBody();

        responseDTO.setEmploye(employe);
        responseDTO.setDepartamentDTO(departamentDTO);

        return responseDTO;

    }
}
