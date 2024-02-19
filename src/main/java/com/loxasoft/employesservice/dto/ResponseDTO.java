package com.loxasoft.employesservice.dto;

import com.loxasoft.employesservice.entity.Employe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public DepartamentDTO getDepartamentDTO() {
        return departamentDTO;
    }

    public void setDepartamentDTO(DepartamentDTO departamentDTO) {
        this.departamentDTO = departamentDTO;
    }

    private Employe employe;
    private DepartamentDTO departamentDTO;
}
