package com.loxasoft.employesservice.controller;

import com.loxasoft.employesservice.dto.ResponseDTO;
import com.loxasoft.employesservice.entity.Employe;
import com.loxasoft.employesservice.service.EmployeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employes")
public class EnployeController {


    private final EmployeService employeService;

    public EnployeController(EmployeService employeService) {
        this.employeService = employeService;
    }

    @PostMapping
    public Employe saveEmploye(@RequestBody Employe employe){
        return employeService.saveEmploye(employe);
    }

    @GetMapping("/{id}")
    public ResponseDTO getEmployeById(@PathVariable Integer id){
        return employeService.getEmployeById(id);
    }
}
